package com.example.demo;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DTO.User;
/**
 * Created by wy_xue on 2018/12/10.
 */

//controller里面的方法都以 return里的内容为主
@RestController
public class HelloController {



    @RequestMapping("/hello")
    public String index() {
//        http://localhost:8080/hello
        return "Hello  World";
    }

    @RequestMapping("/getUser")
    public User getUser() throws IllegalAccessException , InstantiationException{

        //        http://localhost:8080/getUser
        User user=  User.class.newInstance();
        user.setName("小明");
        user.setPassword("xxxx");
        return user;

        //{"password":"xxxx","name":"小明"}
    }



}
