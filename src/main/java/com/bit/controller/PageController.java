package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;

@Controller
public class PageController {

    @RequestMapping("/")
    public String HomepPage(){
        return "index";
    }

    @RequestMapping("/login")
    public String LoginPage(){
        return "login";
    }

    @RequestMapping("/signup")
    public String RegisterPage(){
        return "signup";
    }
}
