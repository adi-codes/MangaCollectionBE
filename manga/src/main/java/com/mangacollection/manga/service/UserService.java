package com.mangacollection.manga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangacollection.manga.model.User;
import com.mangacollection.manga.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> getAllUsers(){
        return repo.findAll();
    }
}
