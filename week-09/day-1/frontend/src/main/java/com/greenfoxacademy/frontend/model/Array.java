package com.greenfoxacademy.frontend.model;

public class Array {

  private int[] numbers;
  private String what;

  public Array(int[] numbers, String what) {
    this.numbers = numbers;
    this.what = what;
  }

  public Array() {

  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

}
