package com.bit.controller;


import com.bit.model.request.Login;
import com.bit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bitly")
public class BitlyController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public void loginCheck(@ModelAttribute Login login){
        System.out.println(login.getPwd());
        System.out.println(login.getId());
    }

}
