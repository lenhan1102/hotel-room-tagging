package com.example.testtagging;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.testtagging.entity.Room;

public interface RoomRepository extends CrudRepository<Room, Integer>{
	
	List<Room> findAll();
}