package com.kerin.apisql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kerin.apisql.dao")
@SpringBootApplication
public class ApisqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(ApisqlApplication.class, args);
  }

}
