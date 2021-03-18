package com.ltts.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String password;
	private String name;
	private String mobile;
	@Column(unique=true)
	private String email;
	private String imageUrl;
	private String DOB;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	private List<Book> books=new ArrayList<>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
	
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public User(int id, String password, String name, String mobile, String email, String imageUrl, String dOB) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.imageUrl = imageUrl;
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", mobile=" + mobile + ", email="
				+ email + ", imageUrl=" + imageUrl + ", DOB=" + DOB + "]";
	}
	
	
	
}
