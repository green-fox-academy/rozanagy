package com.greenfoxacademy.frontend.model;

public class Greeter {

  private String welcomeMessage;

  public Greeter(String name, String title) {
    this.welcomeMessage = String.format("Oh, hi there %s, my dear %s!", name, title);
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }
}
