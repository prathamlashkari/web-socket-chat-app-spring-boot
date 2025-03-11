package com.pratham.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.chatapp.models.Room;
import com.pratham.chatapp.repositories.RoomRepositories;

@RestController
@RequestMapping("/api/v1/rooms")
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

}
