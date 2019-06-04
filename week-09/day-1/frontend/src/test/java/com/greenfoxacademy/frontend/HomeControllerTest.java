package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void index() {
    HomeController homeController = new HomeController();
    String result = homeController.renderMainPage();
    assertEquals("index", result);
  }


}
