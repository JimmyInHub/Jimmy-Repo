package com.jimmy.logfun.service;

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
     * @param userName
     * @param pwd
     * @return ResultInfo
     * @date: 2018/7/27 16:24
     * @author: Jimmy
     */
    ResultInfo login(String userName, String pwd);

}
