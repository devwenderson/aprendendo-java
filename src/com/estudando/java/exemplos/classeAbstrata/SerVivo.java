package com.estudando.java.exemplos.classeAbstrata;

public abstract class SerVivo {
    String raca;
    float altura;

    public SerVivo(String raca, float altura){
        this.raca = raca;
        this.altura = altura;
    }

    public abstract void respirar();

    public String getRaca(){
        return this.raca;
    }
}
