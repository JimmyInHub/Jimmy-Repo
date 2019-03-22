package com.jimmy.logfun.service;

import java.util.List;

import com.jimmy.logfun.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface IUserService {
	void save(User user);
	User get(Long id);
	List<User> find(int pageSize);

	/**
	 * 复写父类方法
	 * @param username
	 * @return
	 * @throws UsernameNotFoundException
	 */
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
