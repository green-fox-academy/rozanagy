package com.greenfoxacademy.foxclub;

import com.greenfoxacademy.foxclub.controller.MainController;

import java.util.ArrayList;

public class Fox {
  private String foxName;
  private ArrayList<String> listOfTricks;
  private ArrayList<String> food;
  private ArrayList<String> drink;

  public Fox(String foxName) {
    this.foxName = foxName;
  }


  public String getFoxName() {
    return foxName;
  }

  public ArrayList<String> getListOfTricks() {
    return listOfTricks;
  }

  public ArrayList<String> getFood() {
    return food;
  }

  public ArrayList<String> getDrink() {
    return drink;
  }
}
