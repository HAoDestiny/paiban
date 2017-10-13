package com.paiban.config;

import com.paiban.interceptors.AuthenticationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Destiny_hao on 2017/10/14.
 */

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //自定义注解@Authority 拦截器
        registry.addInterceptor(new AuthenticationInterceptor()).addPathPatterns("/**");
    }
}
