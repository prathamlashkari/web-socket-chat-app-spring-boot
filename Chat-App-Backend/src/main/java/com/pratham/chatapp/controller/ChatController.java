package com.pratham.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pratham.chatapp.repositories.RoomRepositories;

@Controller
public class ChatController {

  @Autowired
  private RoomRepositories repositories;

}
