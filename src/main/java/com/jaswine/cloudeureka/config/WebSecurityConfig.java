package com.jaswine.cloudeureka.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Web Security Config
 *
 * @author Jaswine
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    /**
     * 开启HTTP Basic认证
     * @param http http
     * @throws Exception 异常
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
        .authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}

