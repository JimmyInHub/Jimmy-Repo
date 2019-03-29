package com.jimmy.logfun.controller;

import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.service.ILoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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
        return "/WEB-INF/jsps/login/login";
    }

    /**
     * @description 登录设置
     * @date: 2019/3/15
     * @author: Jimmy
     */
    @RequestMapping("/login")
    public String login(Model model, User user
            , @RequestParam(value = "error",required = false) boolean error
            , @RequestParam(value = "logout",required = false) boolean logout, HttpServletRequest request){
        model.addAttribute(user);

        //如果已经登陆跳转到个人首页
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if(authentication!=null&&
//                !authentication.getPrincipal().equals("anonymousUser")&&
//                authentication.isAuthenticated()){
//            return "/home";
//        }else{
//
//        }
            //  用户认证成功，则放行，否则提示异常
            error = !loginService.userLogin(user);

        if(error==true)
            model.addAttribute("error",error);
        if(logout==true)
            model.addAttribute("logout",logout);
        return "/WEB-INF/jsps/login/login";
    }
}
