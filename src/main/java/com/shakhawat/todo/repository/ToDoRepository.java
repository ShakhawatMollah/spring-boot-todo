package com.shakhawat.todo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shakhawat.todo.model.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, String>{
	
	Page<ToDo> findAllByOrderByIsDoneAscDateDesc(Pageable pageable);
}
