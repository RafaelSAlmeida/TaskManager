package com.example.taskManager.controler;

import com.example.taskManager.dto.RequestTask;
import com.example.taskManager.dto.ResponseTask;
import com.example.taskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.taskManager.dto.Task;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.List;

@RestController
public class TaskManagerController {

	public static final int TIMEOUT = 60000;

	@Autowired
	private TaskService taskService;

	@RequestMapping(value = "/taskAll", method = RequestMethod.GET)
	public WebAsyncTask<List<Task>> getAllTasks() {
		return new WebAsyncTask<List<Task>>(TIMEOUT, () -> { return taskService.getAllTasks(); });
	}

	@RequestMapping(value = "/task/{id}", method = RequestMethod.GET)
	public WebAsyncTask<Task> getTask(@PathVariable final int id) {
		return new WebAsyncTask<Task>(TIMEOUT, () -> { return taskService.getTask(id); });
	}

	@RequestMapping(value = "/taskAdd", method = RequestMethod.POST)
	public WebAsyncTask<ResponseTask> taskAdd(@RequestBody RequestTask entrada) {
		return new WebAsyncTask<ResponseTask>(TIMEOUT, () -> { return taskService.taskAdd(entrada); });
	}

	@RequestMapping(value = "/taskDel/{id}", method = RequestMethod.GET)
	public WebAsyncTask<String> delTask(@PathVariable final int id) {
		return new WebAsyncTask<String>(TIMEOUT, () -> { return taskService.delTask(id); });
	}

}
