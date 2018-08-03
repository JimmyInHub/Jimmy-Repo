package com.jimmy.logfun.mapper;

import java.util.List;

import com.jimmy.logfun.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface IUserMapper {
	void save(User user);
	User get(Long id);
	List<User> find();
}
