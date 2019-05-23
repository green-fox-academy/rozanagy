package com.greenfoxacademy.hellobeanworld.controller;

import com.greenfoxacademy.hellobeanworld.service.CaesarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class EncodingController {

  @Autowired
  private CaesarService caesarService;

  @ResponseBody
  @GetMapping("/encoder")
  public String encode(String text, int number) {
    return caesarService.encode(text, number);
  }
}
