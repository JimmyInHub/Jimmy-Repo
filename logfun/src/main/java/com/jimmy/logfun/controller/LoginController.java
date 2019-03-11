package com.jimmy.logfun.controller;

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

    @RequestMapping("/login")
    public String index(){
        return "/login/login";
    }
}
