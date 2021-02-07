package com.shakhawat.todo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shakhawat.todo.model.ToDo;
import com.shakhawat.todo.repository.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {
	
	@Autowired
	private ToDoRepository toDoRepository;

	@Override
	public void saveToDo(ToDo toDo) {
		toDo.setCreatedAt(new Date());
		toDoRepository.save(toDo);
	}

	@Override
	public ToDo findToDoById(String id) {
		
		Optional<ToDo> optional = toDoRepository.findById(id);
		ToDo toDo = null;
		if (optional.isPresent()) {
			toDo = optional.get();
		} else {
			throw new RuntimeException("ToDo not found for the ID: " + id);
		}
		
		return toDo;
	}

	@Override
	public void updateToDo(ToDo toDo) {
		
		if(null != toDo.getId()) {
			Optional<ToDo> optional = toDoRepository.findById(toDo.getId());
			if (optional.isPresent()) {
				toDo.setCreatedAt(optional.get().getCreatedAt());
			} else {
				throw new RuntimeException("ToDo not found for the ID: " + toDo.getId());
			}
		}
		toDo.setUpdatedAt(new Date());
		
		toDoRepository.save(toDo);
	}

	@Override
	public Page<ToDo> findPaginated(Pageable pageable) {

		Page<ToDo> toDos = toDoRepository.findAllByOrderByIsDoneAscDateDesc(pageable);
		
		if(toDos.isEmpty()) {
			return Page.empty();
		}
		
		return toDos;
	}
}
