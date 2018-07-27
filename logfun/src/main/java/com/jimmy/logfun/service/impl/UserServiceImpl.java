package com.jimmy.logfun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.mapper.UserMapper;
import com.jimmy.logfun.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public void save(User user) {
		mapper.save(user);
	}

	@Override
	public User get(Long id) {
		return mapper.get(id);
	}

	@Override
	public List<User> find(int pageSize) {
		
		//分页功能
		PageHelper.startPage(0, pageSize);
		List<User> list = mapper.find();
		return list;
	}

}
