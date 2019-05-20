package com.greenfoxacademy.library;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

public class ListBooksByAuthor extends BookController {
  @RequestMapping(path = "/books", method = RequestMethod.GET)
  public String queryBooks(Model model, @RequestParam(name = "author", required = false) String author) {

    List<Book> queriedBooks;

    if (author != null) {
      queriedBooks = filterBooksByAuthor(author);
    } else {
      queriedBooks = getBooks();
    }

    model.addAttribute("books", queriedBooks);
    return "index";
  }

  private List<Book> filterBooksByAuthor(String author) {
    return getBooks().stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toList());
  }
}
