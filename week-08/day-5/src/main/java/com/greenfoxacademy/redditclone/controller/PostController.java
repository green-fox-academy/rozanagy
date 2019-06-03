package com.greenfoxacademy.redditclone.controller;

import com.greenfoxacademy.redditclone.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

  @Autowired
  private PostService postService;


  @GetMapping("/")
  public String renderMainPage(Model model) {
    model.addAttribute("posts", postService.getAllPosts());
    return "index";
  }


}
