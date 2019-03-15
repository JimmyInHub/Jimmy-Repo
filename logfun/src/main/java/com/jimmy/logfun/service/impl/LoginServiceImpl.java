package com.jimmy.logfun.service.impl;

import com.jimmy.logfun.service.ILoginService;
import com.jimmy.logfun.utils.ResultInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * FileName: LoginServiceImpl
 *
 * @author JWELL_Jimmy
 * @create 2019/3/15
 * @since 1.0.0
 */
@Service
@Transactional
public class LoginServiceImpl implements ILoginService {

    /**
     * 登录验证
     * @param userName
     * @param pwd
     * @return ResultInfo
     * @date: 2018/7/27 16:24
     * @author: Jimmy
     */
    @Override
    public ResultInfo login(String userName, String pwd) {
        ResultInfo resultInfo = new ResultInfo();
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(pwd)){
            resultInfo.fail("用户名或者密码错误！");
            return resultInfo;
        }
        return null;
    }
}
