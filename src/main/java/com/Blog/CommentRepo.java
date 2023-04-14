package com.Blog;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blog.Entity.Comments;

public interface CommentRepo  extends JpaRepository<Comments, Integer> {

}
