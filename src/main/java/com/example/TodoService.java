package com.example;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private ArrayList<Todo> todoList = new ArrayList<Todo>();
	
	public ArrayList<Todo> getAll(){
		todoList.add(new Todo("groceries"));
		todoList.add(new Todo("walk dog"));
		todoList.add(new Todo("cook dinner"));
		return todoList;
	}

	public void addTodo(Todo todo) {
		todoList.add(todo);
	}

}
