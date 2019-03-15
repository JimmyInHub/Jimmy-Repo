package com.jimmy.logfun.controller;

import com.jimmy.logfun.service.ILoginService;
import com.jimmy.logfun.utils.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private ILoginService loginService;

    /**
     * @description 跳转到登录页
     * @date: 2019/3/15
     * @author: Jimmy
     */
    @RequestMapping("/index")
    public String index(){
        return "/login/login";
    }

    /**
     * @description 登录设置
     * @date: 2019/3/15
     * @author: Jimmy
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResultInfo login(String userName, String pwd){
        return loginService.login(userName, pwd);
    }
}
