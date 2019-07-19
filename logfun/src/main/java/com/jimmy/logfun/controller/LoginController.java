package com.jimmy.logfun.controller;

import com.jimmy.logfun.domain.User;
import com.jimmy.logfun.service.ILoginService;
import com.jimmy.logfun.utils.ResultInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 登陆控制器
 * @fileName: LoginController.java
 * @date: 2019/3/5 17:42
 * @author: Jimmy
 * @version: v1.0
 */
@Controller
@RequestMapping("/log")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    /**
     * @description 跳转到登录页/登出
     * @date: 2019/3/15
     * @author: Jimmy
     */
    @RequestMapping("/index")
    public String index() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "/login/index";
    }

    /**
     * @description 登录设置
     * @date: 2019/3/15
     * @author: Jimmy
     */
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        Subject currentUser = SecurityUtils.getSubject();

        //  判断是否登陆
        if (!currentUser.isAuthenticated()) {

            //  没登陆，创建验证token
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),
                    user.getPassWord().toCharArray(), "on".equals(user.getRememberMe()));
            try {
                currentUser.login(token);
            } catch (Exception e) {
                String msg = "用户名或密码错误！";
                if (!StringUtils.isEmpty(e.getMessage())) {
                    msg = e.getMessage();
                }
                request.setAttribute("errorMsg", msg);
                return "redirect:/log/index";
            }
            Subject newUser = SecurityUtils.getSubject();
            request.getSession().setAttribute("userInfo", newUser);
        }
        return "redirect:/home/index";
    }

    /**
     * @description 注册页面
     * @date: 2019/4/1
     * @author: Jimmy
     */
    @RequestMapping("/register")
    public String register(User user) {
        ResultInfo resultInfo = loginService.register(user);
        if (resultInfo.getSuccess()) {
            return "redirect:/home/index";
        } else {
            return "/login/index";
        }
    }
}
