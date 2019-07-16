package com.jimmy.logfun.service.impl;

import java.util.List;

import com.jimmy.logfun.utils.ParamsException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.mapper.IUserMapper;
import com.jimmy.logfun.service.IUserService;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserMapper userMapper;
	
	@Override
	public void save(User user) {
		userMapper.save(user);
	}

	@Override
	public User get(Long id) {
		return userMapper.get(id);
	}

	@Override
	public List<User> find(int pageSize) {
		
		//分页功能
		PageHelper.startPage(0, pageSize);
		List<User> list = userMapper.find();
		return list;
	}

	/**
	 * 根据用户名查询用户
	 *
	 * @param username
	 * @return user
	 */
	@Override
	public User getByName(String username) {
		if(StringUtils.isEmpty(username)){
			throw new ParamsException("未获取到参数：username");
		}
		return userMapper.findByUserName(username);
	}
}
