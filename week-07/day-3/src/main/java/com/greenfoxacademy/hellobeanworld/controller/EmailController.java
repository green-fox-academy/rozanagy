package com.greenfoxacademy.hellobeanworld.controller;

import com.greenfoxacademy.hellobeanworld.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

  @Autowired
  private UtilityService utilityService;

  @RequestMapping("/useful/email")
  public String emailValidator(Model model, @RequestParam String email) {
    model.addAttribute("emailAddress", email);
    model.addAttribute("validEmail", utilityService.validateEmail(email));
    return "email";
  }
}
