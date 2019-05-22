package com.greenfoxacademy.hellobeanworld.controller;


import com.greenfoxacademy.hellobeanworld.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColoredController{

  @Autowired
  private UtilityService utilityService;


  @RequestMapping("/useful/colored")
  public String colorBackground(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "color";
  }
}
