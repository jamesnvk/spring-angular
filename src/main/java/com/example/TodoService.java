package com.example;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private ArrayList<Todo> todoList = new ArrayList<Todo>();
	
	public ArrayList<Todo> getAll(){
		todoList.add(new Todo());
		todoList.add(new Todo());
		todoList.add(new Todo());
		return todoList;
	}

}
