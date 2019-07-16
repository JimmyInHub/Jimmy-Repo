package com.jimmy.logfun.domain;

/**
 * FileName: UserRole
 *
 * @author JWELL_Jimmy
 * @descropt 角色用户表
 * @create 2019/7/15
 * @since 1.0.0
 */
public class RolePermission extends BaseEntity{

    /**
     * 权限ID
     */
    private Long pId;

    /**
     * 角色ID
     */
    private Long rId;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }
}
