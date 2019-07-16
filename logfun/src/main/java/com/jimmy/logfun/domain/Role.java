package com.jimmy.logfun.domain;

import javax.validation.constraints.NotNull;

/**
 * FileName: Role
 *
 * @author JWELL_Jimmy
 * @descropt 角色实体
 * @create 2019/7/15
 * @since 1.0.0
 */
public class Role extends BaseEntity{

    /**
     * 角色编码
     */
    @NotNull(message = "角色编码不能为空")
    private String roleCode;

    /**
     * 角色名称
     */
    @NotNull(message = "角色名称不能为空")
    private String roleName;

    /**
     * 角色别名
     */
    private String roleAlias;

    /**
     * 状态(默认10启用，00作废)
     */
    private String status = "10";

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleAlias() {
        return roleAlias;
    }

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
