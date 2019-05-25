package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.service.DrinkService;
import com.greenfoxacademy.foxclub.service.FoodService;
import com.greenfoxacademy.foxclub.Fox;
import com.greenfoxacademy.foxclub.service.FoxService;
import com.greenfoxacademy.foxclub.service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private FoxService foxService;
  private FoodService foodService;
  private DrinkService drinkService;
  private TrickService trickService;

  public MainController(FoodService foodService, DrinkService drinkService, TrickService trickService) {
    this.foodService = foodService;
    this.drinkService = drinkService;
    this.trickService = trickService;
  }

  @RequestMapping("/")
  public String index(Model model, @RequestParam(required = false) String name) {
    if (name == null) {
      return "login";
    } else if (foxService.searchForFox(name)) {
      Fox fox = foxService.findTheFox(name);
      model.addAttribute("fox", fox);
      return "index";
    } else {
      Fox fox = foxService.findTheFox(name);
      model.addAttribute("fox", fox);
      foxService.addNewFox(fox);
      return "index";
    }
  }

  @GetMapping("/login")
  public String renderLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String namePost(String name) {
    return "redirect:/?name=" + name;
  }

  @RequestMapping("/nutritionStore")
  public String nutritionSelector(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("foodList", foodService.findAll());
    model.addAttribute("drinkList", drinkService.findAll());
    model.addAttribute("name", name);
    return "nutrition";
  }

  @RequestMapping("/tricks")
  public String trickSelector(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("trickList", trickService.findAll());
    model.addAttribute("name", name);
    return "trick";
  }
}