package com.SocialMediaProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SocialMediaProject.Entity.Users;

@Repository
public interface UserRepo extends CrudRepository<Users,Integer>{
	
	Users save(Users user);
	Users findByUserName(String userName);
//	Users getUserPassword(String userPassword);
}
