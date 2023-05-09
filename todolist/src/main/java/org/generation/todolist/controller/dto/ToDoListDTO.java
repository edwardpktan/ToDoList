package org.generation.todolist.controller.dto;

import java.util.Date;

public class ToDoListDTO {
    private String title;
    private String description;
    private Date targetDate;
    //private String targetDate;

    public ToDoListDTO(String title, String description, Date targetDate) {
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
}
