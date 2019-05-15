package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetCounterApp {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping("/web/greetings")
  public String greetCounter(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("atomicLong", atomicLong.getAndAdd(1));
    return "greetCounter";
  }


}
