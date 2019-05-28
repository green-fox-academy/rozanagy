package com.greenfoxacademy.mysqltodo;

import com.greenfoxacademy.mysqltodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqltodoApplication {

  @Autowired
  private TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(MysqltodoApplication.class, args);
  }
}

