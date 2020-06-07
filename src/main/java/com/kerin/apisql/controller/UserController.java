package com.kerin.apisql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import com.kerin.apisql.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import com.kerin.apisql.entity.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {
  @Autowired
  private UserService userService;
  @PostMapping(value = "/reg")
  public Object reg(@RequestBody User user) {

    System.out.println(user.getUserName());
    System.out.println(user.getPassword());

    user.setAge(5);
    user.setSex(1);

    userService.add(user);
    user.setId(2);
    user.setAge(6);
    user.setSex(6);
    userService.updateById(user);
    userService.delById(4);
    user = userService.getById(12);

    Map<String, Object> data = new HashMap<String, Object>();
    data.put("user", user);
    return data;
  }


}
