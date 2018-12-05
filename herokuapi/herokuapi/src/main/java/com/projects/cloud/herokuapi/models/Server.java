package com.projects.cloud.herokuapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="servers")
public class Server {
	
	public Server(String id, String name, String status, String description) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.description = description;
	}
	@Id
	private String id;
	private String name;
	private String status;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
