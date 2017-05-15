package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {
	List<Todo> findAll();
}
