package com.pratham.chatapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.chatapp.models.Message;
import com.pratham.chatapp.models.Room;
import com.pratham.chatapp.repositories.RoomRepositories;

@RestController
@RequestMapping("/api/v1/rooms")
@CrossOrigin("*")
public class RoomController {

  @Autowired
  private RoomRepositories repositories;

  @PostMapping("/create")
  public ResponseEntity<?> createRoom(@RequestBody String roomId) {
    if (repositories.findByRoomId(roomId) != null) {
      return new ResponseEntity<>("Room already exist", HttpStatus.BAD_REQUEST);
    }
    Room room = new Room();
    room.setRoomId(roomId);
    Room saveRoom = repositories.save(room);
    return new ResponseEntity<>(saveRoom, HttpStatus.CREATED);
  }

  @GetMapping("/{roomId}")
  public ResponseEntity<?> getRoomById(@PathVariable String roomId) {
    Room room = repositories.findByRoomId(roomId);
    if (room == null)
      return new ResponseEntity<>("Room not found", HttpStatus.BAD_REQUEST);
    return new ResponseEntity<>(room, HttpStatus.FOUND);
  }

  @GetMapping("/{roomId}/messages")
  public ResponseEntity<List<Message>> getMessages(
      @PathVariable String roomId,
      @RequestParam(value = "page", defaultValue = "0", required = false) int page,
      @RequestParam(value = "size", defaultValue = "20", required = false) int size) {
    Room room = repositories.findByRoomId(roomId);
    if (room == null) {
      return ResponseEntity.badRequest().build();
    }
    List<Message> messages = room.getMessages();
    int start = Math.max(0, messages.size() - (page + 1) * size);
    int end = Math.min(messages.size(), start + size);
    List<Message> paginatedMessages = messages.subList(start, end);
    return ResponseEntity.ok(paginatedMessages);

  }

}
