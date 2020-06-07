package com.kerin.apisql.service;

import java.time.LocalDateTime;

import com.kerin.apisql.dao.UserMapper;
import com.kerin.apisql.entity.User;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

  @Resource
  private UserMapper userMapper;

  public void add(User user) {

    userMapper.insertSelective(user);

  }

  public int updateById(User user) {

    return userMapper.updateByPrimaryKeySelective(user);

  }
  public void delById(Integer id) {

    userMapper.deleteByPrimaryKey(id);

  }
  public User getById(Integer id) {

    return userMapper.selectByPrimaryKey(id);

  }
}
