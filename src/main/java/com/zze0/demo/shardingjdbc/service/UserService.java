package com.zze0.demo.shardingjdbc.service;

import com.zze0.demo.shardingjdbc.entity.User;

import java.util.List;

public interface UserService {

    User getById(String id);

    List<User> getAll();

    void insert(User user);

    void testTransaction();
}