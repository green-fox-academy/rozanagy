package com.greenfoxacademy.mysqltodo.controller;

import com.greenfoxacademy.mysqltodo.model.Todo;
import com.greenfoxacademy.mysqltodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;


  @RequestMapping(value = {"/list", "/"})
  public String list(Model model) {
    todoRepository.save(new Todo("do homework"));
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
