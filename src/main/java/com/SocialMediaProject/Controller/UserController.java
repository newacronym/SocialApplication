package com.SocialMediaProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SocialMediaProject.Entity.Users;
import com.SocialMediaProject.Service.UserService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("")
	private Users submitUser(@RequestBody Users users) {
		return userService.submitMetaDataOfUser(users);
		
	}

	@GetMapping("/{userName}")
	private Users getUserDetails(@PathVariable("userName") String userName) {
		return userService.displayUserMetaData(userName);
	}
	
	@GetMapping("/auth/{userName}/{userPassword}")
	private boolean checkUserDetails(@PathVariable("userName") String userName,@PathVariable("userPassword") String userPassword) {
		return userService.checkUser(userName, userPassword);
	}

}
