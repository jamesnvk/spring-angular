package com.example;

import org.springframework.data.repository.CrudRepository;

public interface TodoDAO extends CrudRepository<Todo, Long> {
	
}
