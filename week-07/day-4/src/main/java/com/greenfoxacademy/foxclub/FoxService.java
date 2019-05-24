package com.greenfoxacademy.foxclub;

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
