package com.greenfoxacademy.frontend.model;

public class DoublingNumber {

  private int received;
  private int result;

  public DoublingNumber(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public DoublingNumber() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
