package com.mongodbservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class User {
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String id) {
		super();
		this.id = id;
	}
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + "]";
	}
	
}
