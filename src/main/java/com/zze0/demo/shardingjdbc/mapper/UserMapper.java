package com.zze0.demo.shardingjdbc.mapper;

import com.zze0.demo.shardingjdbc.entity.User;

import java.util.List;


public interface UserMapper {

	User getById(String id);

	List<User> getAll();

	void insert(User user);
}
