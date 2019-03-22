package com.jimmy.logfun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/get")
	public User get(Long id){
		return userService.get(id);
	}
	
	@RequestMapping("/find")
	public List<User> find(int pageSize){
		return userService.find(pageSize);
	}
}
