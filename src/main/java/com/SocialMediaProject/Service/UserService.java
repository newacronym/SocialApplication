package com.SocialMediaProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SocialMediaProject.Entity.Users;
import com.SocialMediaProject.Repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	Users user;
	
	public Users submitMetaDataOfUser(Users user) {
		return userRepo.save(user);
	}
	
	public Users displayUserMetaData(String userName) {
		Users userDetail = userRepo.findByUserName(userName);
		return userDetail;
		
	}
	public boolean checkUser(String userName) {
		Users userDetail = userRepo.findByUserName(userName);
		if(userDetail != null) {
			return true;
		}
		else {
			return false;
		}
	}


}
