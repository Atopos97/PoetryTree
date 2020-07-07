package com.wenxuan.demo.Login.Dao.impl;

import com.wenxuan.demo.Login.Dao.UsersDao;
import com.wenxuan.demo.Login.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersDaoImpl {
    @Autowired
    private UsersDao usersDao;
    public Users findUserByName(Long uuu001){
        return usersDao.findByUuu001(uuu001);
    }
}
