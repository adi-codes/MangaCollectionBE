package com.mangacollection.manga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangacollection.manga.model.User;
import com.mangacollection.manga.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired private UserService service;
    @GetMapping
    public List<User> getAllUsers() { return service.getAllUsers(); }
}
