package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.controller.MainController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;


  @Test
  public void doublingNumberSuccessful() throws Exception {
    mockMvc.perform(get("/doubling"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.errorMessage", is("Please provide an input!")));
  }

  @Test
  public void greetUserSuccessful() throws Exception {
    mockMvc.perform(get("/greeter"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.errorMessage", is("Please provide a name and a title!")));
  }

  @Test
  public void appendASuccessful() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.appended", is("kutya")));
  }

  @Test
  public void doUntilSuccessful() throws Exception {
    mockMvc.perform(post("/dountil/sum")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"until\": \"3\"}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(6)));
  }
}


