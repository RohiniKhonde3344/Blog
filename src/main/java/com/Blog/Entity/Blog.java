package com.Blog.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Blog {


	@Column(name="Blog_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column
	private String Title;
	@Column(length = 7000)
	private String Content;
	@Column
	private int Like;
	@Column
	private int Disike;
	@Column
	private int Comment;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Comments> comments;
	
	
	
	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public int getLike() {
		return Like;
	}

	public void setLike(int like) {
		Like = like;
	}

	public int getDisike() {
		return Disike;
	}

	public void setDisike(int disike) {
		Disike = disike;
	}

	public int getComment() {
		return Comment;
	}

	public void setComment(int comment) {
		Comment = comment;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", Title=" + Title + ", Content=" + Content + ", Like=" + Like + ", Disike=" + Disike
				+ ", Comment=" + Comment + "]";
	}

	public Blog( String title, String content, int like, int disike, int comment) {
		super();
		
		this.Title = title;
		this.Content = content;
		this.Like = like;
		this.Disike = disike;
		this.Comment = comment;
	}
	

	
}
