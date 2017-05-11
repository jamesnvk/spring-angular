package com.example;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
	
	private int id;
	private String title;
	private Boolean checked;
	
	public Todo(int id, String title, Boolean checked){
		this.id = id;
		this.title = title;
		this.checked = checked;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public Boolean isChecked(){
		return this.checked;
	}
	
	public void setChecked(Boolean checked){
		this.checked = checked;
	}
}
