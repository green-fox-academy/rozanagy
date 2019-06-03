package com.greenfoxacademy.frontend.model;


public class ResultArray {

  private int result;

  public ResultArray() {

  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int sumArray(int[] number) {
    int sum = 0;
    for(int i = 0; i < number.length; i++) {
      sum += number[i];
    }
    return sum;
  }

  public int multiplyArray(int[] number) {
    int multiply = 1;
    for (int i = 1; i < number.length; i++) {
      multiply *= number[i];
    }
    return multiply;
  }

  public int[] doubleArray(int[] number) {
    for(int i = 0; i < number.length; i++) {
      number[i] = number[i]*2;
    }
    return number;
  }
}
