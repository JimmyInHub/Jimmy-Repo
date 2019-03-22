package com.jimmy.logfun.mapper;

import java.util.List;

import com.jimmy.logfun.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface IUserMapper {
	void save(User user);
	User get(Long id);
	List<User> find();

	/**
	 * 根据用户名查找
	 * @param userName
	 * @return
	 */
	User findByUserName(@Param("userName") String userName);
}
