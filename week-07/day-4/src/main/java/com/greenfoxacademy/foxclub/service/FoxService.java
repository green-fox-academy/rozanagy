package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {
  ArrayList<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public void addNewFox(Fox fox) {
    foxes.add(fox);
  }




}
