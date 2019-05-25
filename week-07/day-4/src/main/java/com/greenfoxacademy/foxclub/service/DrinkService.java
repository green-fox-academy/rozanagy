package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.Drink;
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
