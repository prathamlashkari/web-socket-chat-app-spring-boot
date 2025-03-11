package com.pratham.chatapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pratham.chatapp.models.Room;

@Repository
public interface RoomRepositories extends MongoRepository<Room, String> {

}
