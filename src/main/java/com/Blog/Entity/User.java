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
public class User {


	@Column(name="User_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column
	private String role;
	@Column
	private String Name;
	@Column
	private String email;
	@Column
	private String password;
	
//	@OneToMany(cascade = CascadeType.ALL , mappedBy = "Blog_id")
//	private Set<Blog> blog;
//	
//	@OneToMany(cascade = CascadeType.ALL , mappedBy = "Comment_id")
//	private Set<Comments> comments;
//	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public User(String role, String name, String email, String password ) {
		super();
		this.role = role;
		this.Name = name;
		this.email = email;
		this.password = password;
		
	}
	

	
		


	@Override
	public String toString() {
		return "User [id=" + id + ", role=" + role + ", Name=" + Name + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
}
