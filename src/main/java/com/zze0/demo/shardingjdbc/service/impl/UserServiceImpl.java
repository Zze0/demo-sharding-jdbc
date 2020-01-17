package com.zze0.demo.shardingjdbc.service.impl;

import com.alibaba.fastjson.JSON;
import com.zze0.demo.shardingjdbc.entity.User;
import com.zze0.demo.shardingjdbc.mapper.UserMapper;
import com.zze0.demo.shardingjdbc.service.UserService;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
 
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @ShardingTransactionType(TransactionType.LOCAL)
    public void testTransaction() {

        User user = new User();
        String uuid = UUID.randomUUID().toString();
        user.setFdId(uuid);
        user.setFdName("name_"+uuid);
        user.setFdPwd("pwd_"+uuid);
        insert(user);

        System.out.println(JSON.toJSONString(user));

        throw new NullPointerException();

    }

}