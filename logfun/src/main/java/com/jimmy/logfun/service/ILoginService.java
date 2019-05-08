package com.jimmy.logfun.service;

import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.utils.ResultInfo;

/**
 * 〈登录接口〉
 * FileName: ILoginService
 *
 * @author JWELL_Jimmy
 * @create 2019/3/15
 * @since 1.0.0
 */
public interface ILoginService {

    /**
     * 登录验证
     * @param user
     * @return Boolean
     * @date: 2018/7/27 16:24
     * @author: Jimmy
     */
    Boolean userLogin(User user);

    /**
     * @description 注册页面
     * @date: 2019/4/1
     * @author: Jimmy
     */
    ResultInfo register(User user);
}
