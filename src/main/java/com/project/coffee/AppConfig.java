/*
package com.project.coffee;

import com.project.coffee.POJO.User;
import com.project.coffee.dao.UserDAO;
import com.project.coffee.rest.UserRest;
import com.project.coffee.restImpl.UserRestImpl;
import com.project.coffee.service.UserService;
import com.project.coffee.serviceImpl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserRest userRest(UserService userService) {
        return new UserRestImpl(userService);
    }

    @Bean
    public UserService userService(UserDAO userDAO) {
        return new UserServiceImpl(userDAO);
    }

}
*/
