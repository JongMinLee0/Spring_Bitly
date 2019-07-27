package com.bit.controller;


import com.bit.model.request.Login;
import com.bit.model.response.ResponseWrapper;
import com.bit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bitly")
public class BitlyController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> loginCheck(@RequestBody Login login){
        ResponseWrapper response = userService.checkLogin(login);
        return new ResponseEntity<ResponseWrapper>(response, HttpStatus.OK);
    }

}
