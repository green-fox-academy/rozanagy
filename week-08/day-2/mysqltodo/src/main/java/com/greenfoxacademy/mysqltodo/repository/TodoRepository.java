package com.greenfoxacademy.mysqltodo.repository;

import com.greenfoxacademy.mysqltodo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
