package com.test.controller;

import com.test.domain.User;
import com.test.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="user")
public class UserController {

    @Autowired
    private UserDao dao;

    @RequestMapping(value="register")
    public String register(User user){
        dao.save(user);
        return "/";
    }

    @RequestMapping(value="login")
    public String login(String password,String username){
        if(dao.findUserByUsernameAndPassword(username,password)!=null)
            return username+":"+password;
        else
            return "error";
    }

}
