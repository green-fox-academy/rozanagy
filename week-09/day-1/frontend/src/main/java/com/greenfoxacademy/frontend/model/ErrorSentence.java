package com.greenfoxacademy.frontend.model;

public class ErrorSentence {

  private String errorMessage;

  public ErrorSentence(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
