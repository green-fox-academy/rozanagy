package com.greenfoxacademy.frontend.controller;


import com.greenfoxacademy.frontend.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {
    if (input != null) {
      return new DoublingNumber(input);
    } else {
      return new ErrorSentence("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greetUser(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return new ErrorSentence("Please provide a name and a title!");
    } else if (name == null) {
      return new ErrorSentence("Please provide a name!");
    } else if (title == null) {
      return new ErrorSentence("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping("/appenda/{appended}")
  public Object appendA(@PathVariable(required = false) String appended) {
    if (appended != null) {
      return new Append(appended);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(required = false) String action, @RequestBody Until until) {
    Result result = new Result();
    if (action.equals("sum")) {
      int sum = 0;
      for (int i = 0; i <= until.getUntil(); i++) {
        sum += i;
      }
      result.setResult(sum);
      return result;
    } else if (action.equals("factor")) {
      int fact = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        fact *= i;
      }
      result.setResult(fact);
      return result;
    } else {
      return new ErrorSentence("Please provide a number!");
    }
  }

  @PostMapping("/arrays")
  public Object countWithArray(@RequestBody Array array) {
    if(array.getWhat() != null || array.getNumbers() != null) {
      ResultArray resultArray = new ResultArray();
      if (array.getWhat().equals("sum")) {
        return resultArray.sumArray(array.getNumbers());
      } else if (array.getWhat().equals("multiply")) {
        return resultArray.multiplyArray(array.getNumbers());
      } else if (array.getWhat().equals("double")) {
        return resultArray.doubleArray(array.getNumbers());
      }
    }
    return new ErrorSentence("Please provide what to do with the numbers!");
  }
}

