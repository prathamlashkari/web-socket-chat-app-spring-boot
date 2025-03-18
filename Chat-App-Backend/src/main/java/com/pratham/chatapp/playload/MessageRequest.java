package com.pratham.chatapp.playload;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MessageRequest {

  private String content;
  private String sender;
  private String roomId;
  private LocalDateTime localDateTime;

}
