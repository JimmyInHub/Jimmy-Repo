package com.jimmy.logfun.service.impl;

import java.util.List;

import com.jimmy.logfun.utils.InnerException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.mapper.IUserMapper;
import com.jimmy.logfun.service.IUserService;
import org.springframework.util.StringUtils;

/**
 * UserDetailService是spring security提供给我们的获取用户信息的Service，主要给security提供验证用户的信息
 * 根据username从数据库获取该用户的信息，然后交给security进行后续比对和处理
 */
@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

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
	 * 根据用户名查找用户信息返回给security
	 * @param userName
	 * @return
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		if(StringUtils.isEmpty(userName)){
			throw new UsernameNotFoundException("未获取到用户名！");
		}
		User user = userMapper.findByUserName(userName);
		return user;
	}
}
