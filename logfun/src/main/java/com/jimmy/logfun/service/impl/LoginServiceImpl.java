package com.jimmy.logfun.service.impl;

import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.service.ILoginService;
import com.jimmy.logfun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
//        if(StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassWord())){
//            return false;
//        }
//
//        /**
//         * 传入的密码
//         * TODO 暂时不做md5加密
//         */
//        String passWord = user.getPassWord();
//
//        UserDetails userDetails = userService.loadUserByUsername(user.getUserName());
//        if(userDetails == null){
//            return false;
//        }
//
//        //  数据库中的密码
//        String userDetailPassword = userDetails.getPassword();
//
//        return passWord.equals(userDetailPassword);
        return true;
    }
}
