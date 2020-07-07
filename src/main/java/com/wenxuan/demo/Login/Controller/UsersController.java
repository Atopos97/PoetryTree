package com.wenxuan.demo.Login.Controller;

import com.wenxuan.demo.Login.Dao.impl.UsersDaoImpl;
import com.wenxuan.demo.Login.Entity.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UsersController {
     UsersDaoImpl usersDaoImpl;
     @GetMapping("/{uuu001}")
    public Users getUsers(@PathVariable("uuu001") Long uuu001){
         return  usersDaoImpl.findUserByName(uuu001);
     }
}
