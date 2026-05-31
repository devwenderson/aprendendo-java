package com.estudando.java.exemplos.interfaces;

public class Sandero implements Carro {
    int ano;

    public Sandero(int ano){
        this.ano = ano;
    }

    public String toString() {
        return "Sandero: {" + "\n" +
                " Ano: " + this.ano + "\n" +
                "}";
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public void freiar() {
        System.out.println("Freiou");
    }
}