package com.estudando.java.projetos.comercio_eletronico;

public class Categoria {
    private int id;
    private String nome;

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;;
    }

    // ----- SETTERS -----
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // ----- GETTERS -----
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
}
