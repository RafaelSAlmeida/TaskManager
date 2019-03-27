package com.example.taskManager.repository;

import com.example.taskManager.dto.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
