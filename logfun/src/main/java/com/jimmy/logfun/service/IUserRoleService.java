package com.jimmy.logfun.service;

import com.jimmy.logfun.domain.Role;

import java.util.List;

/**
 * 〈〉
 * FileName: IUserRoleService
 *
 * @author JWELL_Jimmy
 * @create 2019/7/15
 * @since 1.0.0
 */
public interface IUserRoleService {

    /**
     * 根据用户ID查询用户角色
     * @param id
     * @return List
     */
    List<Role> getByUserId(Long id);

}
