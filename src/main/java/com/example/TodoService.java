package com.example;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepo todoRepo;
	
	public ArrayList<Todo> getAll(){

		ArrayList<Todo> todoList = new ArrayList<Todo>();
		todoRepo.findAll().forEach(todoList::add);

		return todoList;
	}

	public void addTodo(Todo todo) {
		todoRepo.save(todo);
	}

}
