package org.generation.todolist.service;

import org.generation.todolist.repository.ToDoListRepository;
import org.generation.todolist.repository.entity.ToDoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoListServiceMySQL implements ToDoListService {

    private final ToDoListRepository toDoListRepository;

    public ToDoListServiceMySQL(@Autowired ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    @Override
    public ToDoList save(ToDoList toDoList) {
        return toDoListRepository.save(toDoList);
    }

    @Override
    public ArrayList<ToDoList> all() {
        ArrayList<ToDoList> result = new ArrayList<>();
        toDoListRepository.findAll().forEach(result::add);

        return result;
    }

}
