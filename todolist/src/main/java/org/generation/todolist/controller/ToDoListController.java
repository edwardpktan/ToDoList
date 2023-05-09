package org.generation.todolist.controller;

import org.generation.todolist.controller.dto.ToDoListDTO;
import org.generation.todolist.repository.entity.ToDoList;
import org.generation.todolist.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/todolist")
public class ToDoListController {

    private final ToDoListService toDoListService;

    public ToDoListController(@Autowired ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<ToDoList> getToDoList() {
        return toDoListService.all();
    }

    @CrossOrigin
    @PostMapping("/add")
    public void save(@RequestParam(name = "title", required = true) String title,
                     @RequestParam(name = "description", required = true) String description,
                     @RequestParam(name = "targetDate", required = true) Date targetDate) throws IOException {
        ToDoListDTO toDoListDTO = new ToDoListDTO(title, description, targetDate);
        toDoListService.save(new ToDoList(toDoListDTO));

        System.out.println("In all");
    }

}
