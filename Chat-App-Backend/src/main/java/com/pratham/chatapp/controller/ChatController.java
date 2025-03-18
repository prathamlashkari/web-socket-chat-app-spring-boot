package com.pratham.chatapp.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.pratham.chatapp.models.Message;
import com.pratham.chatapp.models.Room;
import com.pratham.chatapp.playload.MessageRequest;
import com.pratham.chatapp.repositories.RoomRepositories;

@Controller
public class ChatController {

  @Autowired
  private RoomRepositories repositories;

  @MessageMapping("/sendMessage/{roomId}")
  @SendTo("/topic/room/{roomId}")
  public Message sendMessage(@DestinationVariable String roomId, @RequestBody MessageRequest msgReq) {
    Room room = repositories.findByRoomId(roomId);
    Message msg = new Message();
    msg.setContent(msgReq.getContent());
    msg.setSender(msgReq.getSender());
    msg.setTimeStamp(LocalDateTime.now());

    if (room != null) {
      room.getMessages().add(msg);
      repositories.save(room);
    } else {
      throw new RuntimeException("Room not found");
    }
    return msg;
  }

}
