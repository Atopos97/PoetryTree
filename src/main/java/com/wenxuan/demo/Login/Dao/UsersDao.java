package com.wenxuan.demo.Login.Dao;

import com.wenxuan.demo.Login.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UsersDao extends JpaRepository<Users,Long> {
    Users findByUuu001(Long uuu001);

}
