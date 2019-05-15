package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloToAllTheWorld {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/sayhello")
  public String hello(Model model) {
      model.addAttribute("greeting", hellos[greetingSelector()]);
      model.addAttribute("color", "color: rgb(" + Math.random()*255 + ", " + Math.random()*255 + ", " + Math.random()*255 + ") ;font-size:" + Math.random()*40 + 10 + "px");;
    return "sayHello";
  }

  private int greetingSelector() {
    int random = (int) (Math.random() * 50 + 1);
    return random;
  }
}
