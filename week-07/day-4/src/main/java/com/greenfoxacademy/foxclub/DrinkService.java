package com.greenfoxacademy.foxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DrinkService {
  ArrayList<Drink> drinks;

  public DrinkService() {
    drinks = new ArrayList<>();
  }

  public void addNewDrink(Drink drink) {
    drinks.add(drink);
  }

}
