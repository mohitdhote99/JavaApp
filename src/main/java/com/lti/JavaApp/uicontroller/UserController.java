package com.lti.JavaApp.uicontroller;

import com.lti.JavaApp.beans.User;
import com.lti.JavaApp.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	//http://localhost:8282/User/add_user
	@PostMapping("/add_user")
	public User addUser(@RequestBody User userobj){
		System.out.println("user calls service "+userobj);
		return userService.addUser(userobj);
	}
	@GetMapping("/javaapp")
    public String hello() {
        return "Full Stack Java with Spring Boot and VueJS!";
    }
	
}