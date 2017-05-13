package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "todos")
public class Todo {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "checked")
	private Boolean checked;
	
	public Todo(){
		
	}
	
	public Todo(String title){
		this.title = title;
	}
	
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
