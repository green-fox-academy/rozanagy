package com.greenfoxacademy.foxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoodService {
  ArrayList<Food> foods;

  public FoodService() {
    foods = new ArrayList<>();
  }

  public void addNewFood(Food food) {
    foods.add(food);
  }
}
