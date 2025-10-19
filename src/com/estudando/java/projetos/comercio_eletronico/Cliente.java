package com.estudando.java.projetos.comercio_eletronico;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Cliente(int id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\n" +
                "Nome: " + this.nome + "\n" +
                "Telefone: " + this.telefone + "\n" +
                "Email: " + this.email + "\n";
    }

    // ---------- SETTERS ----------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // ---------- GETTERS ----------
    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }
}
