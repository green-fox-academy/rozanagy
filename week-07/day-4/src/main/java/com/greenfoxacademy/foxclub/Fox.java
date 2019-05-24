package com.greenfoxacademy.foxclub;

import com.greenfoxacademy.foxclub.controller.MainController;

import java.util.ArrayList;

public class Fox {
  private String foxName;
  public ArrayList<String> listOfTricks = new ArrayList<>();
  private String food;
  private String drink;

  public Fox(String foxName) {
    this.foxName = foxName;
  }


  public String getFoxName() {
    return foxName;
  }

  public ArrayList<String> getListOfTricks() {
    return listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }
}
