package com.Blog;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Blog.Entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	@Query("select u from com.Blog.Entity.User u where u.Name=?1 and u.password=?2")
	public  User finduser(String u,String p); 
	
	
}
