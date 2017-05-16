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
	
	public Todo findOne(Long id){
		return todoRepo.findOne(id);
	}

	public Todo addTodo(Todo todo) {
		return todoRepo.save(todo);
	}

	public Todo updateTodo(Todo todo) {
		return todoRepo.save(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todoRepo.delete(todo);
	}

}
