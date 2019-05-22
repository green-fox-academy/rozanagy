package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.color.MyColor;
import com.greenfoxacademy.hellobeanworld.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  HellobeanworldApplication(Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();

  }
}
