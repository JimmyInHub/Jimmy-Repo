package com.jimmy.logfun.utils;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 〈权限控制配置中心〉
 * FileName: MySecurityConfig
 *
 * @author JWELL_Jimmy
 * @create 2019/3/13
 * @since 1.0.0
 */

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()          // 定义当需要用户登录时候，转到的登录页面。
                .loginPage("/login")      // 设置登录页面
                .loginProcessingUrl("/login") // 自定义的登录接口
                .failureForwardUrl("/?error=true")  //登陆失败进行转发，这里回到登陆页面，参数error可以告知登陆状态
                .defaultSuccessUrl("/me")   //登陆成功的url，这里去到个人首页
                .and()
                .logout()
                .logoutUrl("/logout").permitAll()
                .logoutSuccessUrl("/?logout=true")  //按顺序，第一个是登出的url，security会拦截这个url进行处理，所以登出不需要我们实现，第二个是登出url，logout告知登陆状态
                .and()
                .rememberMe()
                .tokenValiditySeconds(604800)   //记住我功能，cookies有限期是一周
                .rememberMeParameter("remember-me") //登陆时是否激活记住我功能的参数名字，在登陆页面有展示
                .rememberMeCookieName("workspace")//cookies的名字，登陆后可以通过浏览器查看cookies名字
                .and()
                .authorizeRequests()    // 定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/login","/home","/css/**","/img/**","/fonts/**","/lib/**","/js/**").permitAll()   // 放行登录页面及静态资源
                .antMatchers("/me").hasAnyRole("member","admin")   //个人首页只允许拥有admin.member角色的用户访问
                .anyRequest()        // 任何请求,登录后可以访问
                .authenticated()
                .and()
                .csrf()
                .disable();     // 关闭csrf防护
    }
}
