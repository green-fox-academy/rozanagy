package com.greenfoxacademy.hellobeanworld.color;

import com.greenfoxacademy.hellobeanworld.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

  private Printer printer;

  @Autowired
  public GreenColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is green in color...");
  }
}
