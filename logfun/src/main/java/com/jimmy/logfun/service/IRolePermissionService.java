package com.jimmy.logfun.service;

import com.jimmy.logfun.domain.Permission;

import java.util.List;

/**
 * 〈〉
 * FileName: IRolePermissionService
 *
 * @author JWELL_Jimmy
 * @create 2019/7/15
 * @since 1.0.0
 */
public interface IRolePermissionService {

    /**
     *  根据角色ID查询权限
     * @param id
     * @return  list
     */
    List<Permission> getByRoleId(Long id);

}
