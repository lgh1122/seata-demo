package com.laiyuezs.storage.config;

import io.seata.integration.http.TransactionPropagationIntercepter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class SeataHandlerInterceptorConfiguration implements WebMvcConfigurer {
    public SeataHandlerInterceptorConfiguration() {
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册HandlerInterceptor，拦截所有请求
        registry.addInterceptor(new TransactionPropagationIntercepter()).addPathPatterns(new String[]{"/**"});
    }
}
