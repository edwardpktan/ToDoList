package org.generation.todolist.repository;

import org.generation.todolist.repository.entity.ToDoList;
import org.springframework.data.repository.CrudRepository;

public interface ToDoListRepository extends CrudRepository<ToDoList, Integer> {


}
