package com.example.springreact;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1,"Kim", "서울"));
        users.add(new User(2,"Lee", "부산"));
        users.add(new User(3,"Park", "대구"));
    }

    public List<User> findAll(){
        return users;
    }
}
