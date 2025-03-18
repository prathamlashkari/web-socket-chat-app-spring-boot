package com.pratham.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.pratham.chatapp.models.Message;
import com.pratham.chatapp.repositories.RoomRepositories;

@Controller
public class ChatController {

  @Autowired
  private RoomRepositories repositories;

  @MessageMapping("/sendMessage/{roomId}")
  @SendTo("/topic/room/{roomId}")
  public Message sendMessage() {
    return null;
  }

}
