package com.etc;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 * eureka开启验证后无法连接注册中心?
 * spring Cloud 2.0 以上的security默认启用了csrf检验，要在eurekaServer端配置security的csrf检验为false
 * */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();//把csrf的验证关闭
        super.configure(http);
    }
}
