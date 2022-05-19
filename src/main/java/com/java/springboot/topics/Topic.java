package com.java.springboot.topics;

public class Topic {
	private String description;

	private String  id;
	private String  name;
 
	//Constructors using fields  
	public Topic( String id, String name,String description) {
		super();
		this.description = description;
		this.id = id;
		this.name = name;
	}
	
	//Constructors using superclass
	public Topic() {
		super();
		
	}
	
	
	//Getters and Setters
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
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

}
