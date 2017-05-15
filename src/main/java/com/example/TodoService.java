package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepo todoRepo;
	
	public List<Todo> getAll(){
		return todoRepo.findAll();
	}

	public void addTodo(Todo todo) {
		todoRepo.save(todo);
	}

	public void updateTodo(Todo todo) {
		todoRepo.save(todo);
	}

}
