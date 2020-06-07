package com.kerin.apisql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.kerin.apisql.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import com.kerin.apisql.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @Autowired
  private UserService userService;
  @PostMapping(value = "/reg")
  public String reg(@RequestBody User user) {

    System.out.println(user.getUserName());
    System.out.println(user.getPassword());

    user.setUserName("ssss");
    user.setAge(5);
    user.setSex(1);

    userService.add(user);
    return "leihou";
  }


}
