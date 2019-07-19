package com.jimmy.logfun.config;

import com.jimmy.logfun.domain.Permission;
import com.jimmy.logfun.domain.Role;
import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.service.IRolePermissionService;
import com.jimmy.logfun.service.IUserRoleService;
import com.jimmy.logfun.service.IUserService;
import com.jimmy.logfun.utils.EncryptUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * FileName: MyRealm
 *
 * @author JWELL_Jimmy
 * @create 2019/7/12
 * @since 1.0.0
 */
@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;
    @Autowired
    private IUserRoleService userRoleService;
    @Autowired
    private IRolePermissionService rolePermissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //  获取当前用户
        User user = (User)principals.getPrimaryPrincipal();
        if(user != null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

            //  获取用户角色
            List<Role> roles = userRoleService.getByUserId(user.getId());
            if(roles == null || roles.isEmpty()){
                return null;
            }
            for (int i = 0; i < roles.size(); i++) {
                Role role =  roles.get(i);
                info.addRole(role.getRoleCode());

                //  获取用户权限
                List<Permission> permissions = rolePermissionService.getByRoleId(role.getId());
                if(permissions == null || permissions.isEmpty()){
                    return null;
                }
                for (int j = 0; j < permissions.size(); j++) {
                    Permission permission =  permissions.get(j);
                    info.addStringPermission(permission.getpCode());
                }
            }
            return info;
        }
        return null;
    }

    /**
     * 获取用户信息，以便框架进行比对
     * @param authenticationToken
     * @return
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        User user = userService.getByName(token.getUsername());
        if(user == null){
            throw new AccountException("账户不存在");
        }
        if("00".equals(user.getStatus())){
            throw new DisabledAccountException("账号已经禁止登录");
        }
        return new SimpleAuthenticationInfo(user,user.getPassWord(),getName());
    }
}
