package com.example.taskManager.dto;

import java.io.Serializable;

public class RequestTask implements Serializable {

    private int id;
    private String titulo;
    private String descricao;
    private String status;


    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

}
