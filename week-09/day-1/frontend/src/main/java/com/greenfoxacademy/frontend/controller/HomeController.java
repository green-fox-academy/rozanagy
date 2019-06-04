package com.greenfoxacademy.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

  @GetMapping("/")
  public String renderMainPage() {
    return "index";
  }
}
