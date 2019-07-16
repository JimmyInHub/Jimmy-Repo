package com.jimmy.logfun.service.impl;

import com.jimmy.logfun.domain.Permission;
import com.jimmy.logfun.service.IRolePermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName: RolePermissionServiceImpl
 *
 * @author JWELL_Jimmy
 * @descropt 此类的描述
 * @create 2019/7/15
 * @since 1.0.0
 */
@Service
public class RolePermissionServiceImpl implements IRolePermissionService {

    /**
     * 根据角色ID查询权限
     *
     * @param id
     * @return list
     */
    @Override
    public List<Permission> getByRoleId(Long id) {
        return null;
    }
}
