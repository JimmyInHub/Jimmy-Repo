package com.jimmy.logfun.service.impl;

import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.service.ILoginService;
import com.jimmy.logfun.service.IUserService;
import com.jimmy.logfun.utils.EncryptUtil;
import com.jimmy.logfun.utils.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Autowired
    private IUserService userService;

    /**
     * 登录验证
     * @param user
     * @return Boolean
     * @date: 2018/7/27 16:24
     * @author: Jimmy
     */
    @Override
    public Boolean userLogin(User user) {
        if(StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassWord())){
            return false;
        }
        return true;
    }

    /**
     * @param user
     * @description 注册页面
     * @date: 2019/4/1
     * @author: Jimmy
     */
    @Override
    public ResultInfo register(User user) {
        ResultInfo resultInfo = new ResultInfo();
        if (user == null) {
            resultInfo.fail("未获取到参数！");
            return resultInfo;
        }
        if(StringUtils.isEmpty(user.getUserName())){
            resultInfo.fail("请输入用户昵称！");
            return resultInfo;
        }
        if(StringUtils.isEmpty(user.getPassWord())){
            resultInfo.fail("请输入密码！");
            return resultInfo;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
        String createTime = sdf.format(new Date());
        user.setCreateTime(createTime);
        user.setUpdateTime(createTime);
        user.setCreateName(user.getUserName());
        user.setUpdateName(user.getUpdateName());

        //  密码进行md5加密
        user.setPassWord(EncryptUtil.md5(user.getPassWord()));
        userService.save(user);

        return resultInfo;
    }
}
