package com.example.taskManager.service;

import com.example.taskManager.dto.RequestTask;
import com.example.taskManager.dto.Task;
import com.example.taskManager.dto.ResponseTask;

import java.util.List;

public interface TaskService {

    public Task getTask(int id);
    public List<Task> getAllTasks();
    public ResponseTask taskAdd(RequestTask entrada);
    public String delTask(int id);

}
