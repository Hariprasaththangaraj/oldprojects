package com.category.model;

public class Category {

	private Long id;
	private String name;
	private Email email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
}
