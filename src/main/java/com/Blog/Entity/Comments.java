package com.Blog.Entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Comments {
	

	@Column(name="Comment_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column
	private String Comments;
	@Column
	private Date Date;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="blog_id")
	private Blog blogid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="User_id")
	private User userid;
	
	
	public Comments() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Blog getBlogid() {
		return blogid;
	}

	public void setBlogid(Blog blogid) {
		this.blogid = blogid;
	}

	public  User getAdminid() {
		return userid;
	}

	public void setAdminid(User userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Comments [id=" + id + ", Comments=" + Comments + ", Date=" + Date + ", blogid=" + blogid + ", userid="
				+ userid + "]";
	}

	public Comments(int id, String comments, java.sql.Date date, Blog blogid, User userid) {
		super();
		
		this.Comments = comments;
		this.Date = date;
		this.blogid = blogid;
		this.userid = userid;
	}
	
	

}
