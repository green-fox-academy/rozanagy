package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnjoyController {

  @GetMapping("/enjoy")
  public String display(Model model) {
    String sentenceToDisplay = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("HTMLception", sentenceToDisplay);
    return "enjoy";
  }
}
