package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wy_xue on 2018/12/10.
 */

//controller里面的方法都以 return里的内容为主
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello  World";
    }
}
