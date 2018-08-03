package com.jimmy.logfun.domain;

/**
 * @ProjectName: Jimmy-Repo
 * @Package: com.jimmy.logfun.domain
 * @ClassName: Album
 * @Description: 相册实体
 * @Author: Jimmy
 * @CreateDate: 2018/8/3 14:09
 * @UpdateUser:
 * @UpdateDate: 2018/8/3 14:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Album  extends BaseEntity{

    //  名称
    private String title;

   //   描述
    private String describe;

    //	作者
    private String author;

    //	状态
    private String status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
