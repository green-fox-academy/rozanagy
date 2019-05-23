package com.greenfoxacademy.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/login")
  public String renderLogin(@RequestParam(required = false) String name) {
    return "login";
  }

  @PostMapping("/login")
  public String namePost(String name) {
    return "redirect:/?name=" + name;
  }

}
