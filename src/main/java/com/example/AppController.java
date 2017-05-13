package com.example;

import java.util.*;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class AppController {
	
	@RequestMapping(value="/")
	public ArrayList<Todo> index(){
		ArrayList<Todo> list = new ArrayList<Todo>();
		list.add(new Todo());
		list.add(new Todo());
		list.add(new Todo());
		return list;
	}
}