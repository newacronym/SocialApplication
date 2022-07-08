package com.SocialMediaProject.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SocialMediaProject.Entity.Status;

@Repository
public interface StatusRepo extends CrudRepository<Status, Integer>{
	

	Status save(Status save);
	ArrayList<Status> findAll();



}
