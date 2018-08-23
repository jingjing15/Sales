package com.hh.dao;

import com.hh.pojo.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    Users login(Users users);

}
