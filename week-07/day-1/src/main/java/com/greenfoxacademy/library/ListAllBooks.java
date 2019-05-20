package com.greenfoxacademy.library;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ListAllBooks extends BookController {
  @RequestMapping(path = "/books", method = RequestMethod.GET)
  public String showBooks(Model model) {
    model.addAttribute("books", books);
    return "index";
  }
}
