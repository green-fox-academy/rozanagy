package com.greenfoxacademy.redditclone.service;

import com.greenfoxacademy.redditclone.model.Post;
import com.greenfoxacademy.redditclone.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImp implements PostService{

  @Autowired
  PostRepository postRepository;

  @Override
  public void addPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public List<Post> getAllPosts() {
    return postRepository.findAllByOrderByVotesDesc();
  }

  @Override
  public void upVotePost() {

  }

  @Override
  public void downVotePost() {

  }
}
