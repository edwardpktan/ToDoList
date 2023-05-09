package org.generation.todolist.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.generation.todolist.controller.dto.ToDoListDTO;

import java.util.Date;

@Entity
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private Date targetDate;

    public ToDoList() {

    }

    public ToDoList(ToDoListDTO toDoListDTO) {

        this.title = toDoListDTO.getTitle();
        this.description = toDoListDTO.getDescription();
        this.targetDate = toDoListDTO.getTargetDate();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "ToDoList{" + "id" + id + ", title=" + title + "\'" + ", description" + description + ", Target Date" + targetDate + "}";
    }

}
