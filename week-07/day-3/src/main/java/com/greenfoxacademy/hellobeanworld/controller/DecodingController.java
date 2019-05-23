package com.greenfoxacademy.hellobeanworld.controller;

import com.greenfoxacademy.hellobeanworld.service.CaesarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class DecodingController {

  @Autowired
  private CaesarService caesarService;

  @ResponseBody
  @GetMapping("/decoder")
  public String decode(String text, int number) {
    return caesarService.decode(text, number);
  }

}
