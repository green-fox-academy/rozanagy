package com.greenfoxacademy.redditclone.repository;

import com.greenfoxacademy.redditclone.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
  List<Post> findAllByOrderByVotesDesc();
}
