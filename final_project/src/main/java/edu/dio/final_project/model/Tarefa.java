package edu.dio.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String atribuidoA;
    private boolean concluida;

    public Tarefa() {}

    public Tarefa(String nome, String descricao, String atribuidoA) {
        this.nome = nome;
        this.descricao = descricao;
        this.atribuidoA = atribuidoA;
        this.concluida = false;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAtribuidoA() {
        return atribuidoA;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
