package com.jimmy.logfun.controller;

import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.service.ILoginService;
import com.jimmy.logfun.utils.ResultInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 登陆控制器
 * @fileName: LoginController.java
 * @date: 2019/3/5 17:42
 * @author: Jimmy
 * @version: v1.0
 */
@Controller
@RequestMapping("/")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private ILoginService loginService;

    /**
     * @description 跳转到登录页
     * @date: 2019/3/15
     * @author: Jimmy
     */
    @RequestMapping("/index")
    public String index(){
        return "/login/index";
    }

    /**
     * @description 登录设置
     * @date: 2019/3/15
     * @author: Jimmy
     */
    @RequestMapping("/login")
    public String login(User user){
        Subject currentUser = SecurityUtils.getSubject();

        //  判断是否登陆
        if(!currentUser.isAuthenticated()){

            //  没登陆，创建验证token
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),
                    user.getPassWord().toCharArray(), "on".equals(user.getRememberMe()));
            currentUser.login(token);
        }
        return "/home";
    }

    /**
     * @description 注册页面
     * @date: 2019/4/1
     * @author: Jimmy
     */
    @RequestMapping("/register")
    public String register(User user){
        ResultInfo resultInfo = loginService.register(user);
        if (resultInfo.getSuccess()){
            return "/index";
        }else{
            return "/login/index";
        }
    }
}
