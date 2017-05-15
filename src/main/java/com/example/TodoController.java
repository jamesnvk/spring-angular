package com.example;

import java.util.*;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value="/todos")
	public java.util.List<Todo> index(){
		return todoService.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/todos")
	public void create(@RequestBody Todo todo){
		todoService.addTodo(todo);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/todos/{id}")
	public void update(@RequestBody Todo todo, @PathVariable Long id){
		todo.setId(id);
		System.out.println(todo);
		todoService.updateTodo(todo);
	}

}