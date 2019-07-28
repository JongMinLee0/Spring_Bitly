package com.bit.config;

import com.bit.service.UserService;
import com.bit.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}

