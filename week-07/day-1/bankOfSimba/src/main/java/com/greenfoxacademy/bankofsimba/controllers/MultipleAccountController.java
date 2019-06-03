package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MultipleAccountController {
  List<BankAccount> accountList = Arrays.asList(
      new BankAccount("Nala", 5000, "lion"),
      new BankAccount("Zazu", 500, "bird"),
      new BankAccount("Pumbaa", 600, "warthog"),
      new BankAccount("Timon", 100, "meerkat"),
      new BankAccount("Rafiki", 10000, "mandrill")
  );

  @RequestMapping("/account")
  public String fill(Model model) {
    model.addAttribute("multipleAccount", accountList);
    return "accounts";
  }
}
