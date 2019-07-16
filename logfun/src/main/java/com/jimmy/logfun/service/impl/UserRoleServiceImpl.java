package com.jimmy.logfun.service.impl;

import com.jimmy.logfun.domain.Role;
import com.jimmy.logfun.service.IUserRoleService;
import com.jimmy.logfun.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName: UserRoleServiceImpl
 *
 * @author JWELL_Jimmy
 * @descropt 此类的描述
 * @create 2019/7/15
 * @since 1.0.0
 */
@Service
public class UserRoleServiceImpl implements IUserRoleService {

    /**
     * 根据用户ID查询用户角色
     *
     * @param id
     * @return List
     */
    @Override
    public List<Role> getByUserId(Long id) {
        return null;
    }
}
