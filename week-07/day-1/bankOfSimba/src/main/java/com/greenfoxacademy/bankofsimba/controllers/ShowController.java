package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ShowController {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/show")
  public String add(Model model) {
    model.addAttribute("bankAccount", bankAccount);
    return "index";
  }


}
