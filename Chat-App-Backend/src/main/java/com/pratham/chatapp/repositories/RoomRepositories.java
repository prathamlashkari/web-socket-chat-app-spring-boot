package com.pratham.chatapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratham.chatapp.models.Room;

public interface RoomRepositories extends MongoRepository<Room, String> {

  Room findByRoomId(String roomId);
}
