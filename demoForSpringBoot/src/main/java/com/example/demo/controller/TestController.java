package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.mapping.UserMapper;

@RestController
public class TestController {
	
	@Autowired
	private UserMapper userMapper ;
	
	@GetMapping(value = "/test")
	public String test() {
		User user = new User();
		user.setName("qyj");
		int id = this.userMapper.insert(user);
		System.out.println(id);
		System.out.println(22);
		return String.valueOf(user.getId());
	}

}
