package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index(Model model, @RequestParam(required = false) String name) {
    if(name == null) {
      return "login";
    } else {
      Fox fox = new Fox(name);
      model.addAttribute("fox", fox);
    }
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
