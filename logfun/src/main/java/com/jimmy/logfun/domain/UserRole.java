package com.jimmy.logfun.domain;

/**
 * FileName: UserRole
 *
 * @author JWELL_Jimmy
 * @descropt 用户角色表
 * @create 2019/7/15
 * @since 1.0.0
 */
public class UserRole extends BaseEntity{

    /**
     * 用户ID
     */
    private Long uId;

    /**
     * 角色ID
     */
    private Long rId;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }
}
