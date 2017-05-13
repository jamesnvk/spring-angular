package com.example;

import java.util.*;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value="/")
	public ArrayList<Todo> index(){
		return todoService.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void create(@RequestBody Todo todo){
		todoService.addTodo(todo);
	}

}