package com.estudando.java.exemplos.classeAbstrata;

public class Humano extends SerVivo {
    protected int idade;
    protected String nome;

    public Humano(int idade, String nome, String raca, float altura){
        super(raca, altura);
        this.idade = idade;
        this.nome = nome;
    }
    @Override
    public void respirar() {
        System.out.println("Respirando");
    }

    public int getIdade(){
        return this.idade;
    }

    public void falar(){
        System.out.println("Meu nome é " + this.nome);
    }
}
