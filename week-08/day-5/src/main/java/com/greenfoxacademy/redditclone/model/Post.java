package com.greenfoxacademy.redditclone.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int votes;
  private String title;
  private String url;


  public void increaseVotes() {
    this.votes++;
  }

  public void decreaseVotes() {
    if(this.votes > 0) {
      this.votes--;
    }
  }

  public Post() {
    this.votes = 0;
    this.title = "";
    this.url = "";
  }

  public Post(String title, String url) {
    this.votes = 0;
    this.title = title;
    this.url = url;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
