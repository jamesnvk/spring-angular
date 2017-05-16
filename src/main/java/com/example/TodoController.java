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
	public Todo create(@RequestBody Todo todo){
		return todoService.addTodo(todo);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/todos/{id}")
	public Todo update(@RequestBody Todo todo, @PathVariable Long id){
		todo.setId(id);
		return todoService.updateTodo(todo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/todos/{id}")
	public void delete(@PathVariable Long id){
		Todo todo = todoService.findOne(id);
		todoService.deleteTodo(todo);
	}
}