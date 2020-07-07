package com.wenxuan.demo.Login.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value="/login")
    public String user(){
        return "login";
    }
}
