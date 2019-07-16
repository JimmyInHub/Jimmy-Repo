package com.jimmy.logfun.domain;

import javax.validation.constraints.NotNull;

/**
 * FileName: Permission
 *
 * @author JWELL_Jimmy
 * @descropt 权限实体
 * @create 2019/7/15
 * @since 1.0.0
 */
public class Permission extends BaseEntity{

    /**
     * 权限编码
     */
    @NotNull(message = "权限编码不能为空")
    private String pCode;

    /**
     * 权限名称
     */
    @NotNull(message = "权限名称不能为空")
    private String pName;

    /**
     * 权限别名
     */
    private String pAlias;

    /**
     * 状态(默认10启用，00作废)
     */
    private String status = "10";

    /**
     * 描述
     */
    private String remark;

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpAlias() {
        return pAlias;
    }

    public void setpAlias(String pAlias) {
        this.pAlias = pAlias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
