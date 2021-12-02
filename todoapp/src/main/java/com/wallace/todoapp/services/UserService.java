package com.wallace.todoapp.services;

import com.wallace.todoapp.model.User;
import com.wallace.todoapp.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUser(User user){

        return null;
    }

    public Boolean getUserByUsername(String username, String password){

        return null;
    }

    public Boolean findUserByUsername(String username){

        return null;
    }

    public void saveUser(User user){

    }
}
