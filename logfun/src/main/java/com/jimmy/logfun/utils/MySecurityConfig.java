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
                .and()
                .authorizeRequests()    // 定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/login","/css/**","/img/**","/font/**","/fonts/**","/lib/**","/js/frames/**","/js/css/**").permitAll()   // 放行登录页面及静态资源
                .anyRequest()        // 任何请求,登录后可以访问
                .authenticated()
                .and()
                .csrf().disable();     // 关闭csrf防护
    }
}
