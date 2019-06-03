package com.greenfoxacademy.redditclone.service;

import com.greenfoxacademy.redditclone.model.Post;

import java.util.List;

public interface PostService {

  void addPost(Post post);
  List<Post> getAllPosts();
  void upVotePost();
  void downVotePost();
}
