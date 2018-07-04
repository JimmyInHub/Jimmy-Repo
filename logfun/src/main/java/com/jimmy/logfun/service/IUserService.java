package com.jimmy.logfun.service;

import java.util.List;

import com.jimmy.logfun.domain.User;

public interface IUserService {
	void save(User user);
	User get(Long id);
	List<User> find(int pageSize);
}
