package com.pratham.chatapp.models;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Message")
public class Message {
  private String sender;
  private String content;
  private LocalDateTime timeStamp;

  public Message(String sender, String content) {
    this.sender = sender;
    this.content = content;
    this.timeStamp = LocalDateTime.now();
  }
}
