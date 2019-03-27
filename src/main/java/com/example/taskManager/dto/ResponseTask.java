package com.example.taskManager.dto;

import java.io.Serializable;

public class ResponseTask implements Serializable {

    private Task task;
    private String mensagem;

    public Task getTask() { return task; }

    public void setTask(Task task) { this.task = task; }

    public String getMensagem() { return mensagem; }

    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}
