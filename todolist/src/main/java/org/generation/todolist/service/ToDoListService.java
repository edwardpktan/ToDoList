package org.generation.todolist.service;

import org.generation.todolist.repository.entity.ToDoList;

import java.util.ArrayList;

public interface ToDoListService {

    ToDoList save(ToDoList toDoList);

    ArrayList<ToDoList> all();

}
