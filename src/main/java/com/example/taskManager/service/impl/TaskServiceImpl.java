package com.example.taskManager.service.impl;

import com.example.taskManager.dto.RequestTask;
import com.example.taskManager.dto.ResponseTask;
import com.example.taskManager.dto.Task;
import com.example.taskManager.repository.TaskRepository;
import com.example.taskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task getTask(int id){
        return taskRepository.findOne(id);
    }

    public List<Task> getAllTasks(){
        Iterable<Task> iterable = taskRepository.findAll();
        List<Task> list = new ArrayList<>();
        for (Task task : iterable) {
            list.add(task);
        }
        return list;
    }

    public ResponseTask taskAdd(RequestTask entrada){
        //Validação de campos
        ResponseTask responseTask = new ResponseTask();
        if(entrada.getTitulo() == null || entrada.getTitulo().equals("")){
            responseTask.setMensagem("O título da tarefa deve ser informado");
            return responseTask;
        }

        if(entrada.getStatus() == null || entrada.getStatus().equals("")){
            responseTask.setMensagem("O Status da tarefa deve ser informado");
            return responseTask;
        }

        Task task = new Task();
        task.setId(entrada.getId());
        task.setTitulo(entrada.getTitulo());
        task.setDescricao(entrada.getDescricao());
        task.setStatus(entrada.getStatus());
        task.setDataCriacao(new Date());

        if(taskRepository.exists(task.getId())){
            task.setDataAtualizacao(new Date());

        }

        if(task.getStatus().equals("S")){
            task.setDataConclusao(new Date());

        }
        task = taskRepository.save(task);
        responseTask.setTask(task);
        responseTask.setMensagem("success");
        return responseTask;
    }

    public String delTask(int id){
        taskRepository.delete(id);
        return "removed";
    }

}
