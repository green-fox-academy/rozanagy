package com.greenfoxacademy.hellobeanworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsefulController {

  @RequestMapping("/useful")
  public String useful() {
    return "useful";
  }
}
