package com.jimmy.logfun.mapper;

import java.util.List;

import com.jimmy.logfun.domain.User;

public interface UserMapper {
	void save(User user);
	User get(Long id);
	List<User> find();
}
