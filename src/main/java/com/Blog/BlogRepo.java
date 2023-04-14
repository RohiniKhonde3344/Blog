package com.Blog;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Blog.Entity.Blog;
import com.Blog.Entity.User;


@Repository
public interface BlogRepo  extends JpaRepository<Blog, Integer> {
	@Query("select b from com.Blog.Entity.Blog b where b.Title=?1 and b.Content=?2")
	public  List<Blog> showblog(String Title,String Content); 

}
