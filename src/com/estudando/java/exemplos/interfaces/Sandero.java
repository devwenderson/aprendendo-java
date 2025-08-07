package com.estudando.java.exemplos.interfaces;

public class Sandero implements Carro {
    int ano;

    public Sandero(int ano){
        this.ano = ano;
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

class InstaciaSandero {
    public void instanciar(){
        // O TIPO DA VARIÁVEL PODE SER O NOME DA INTERFACE
        Carro meuCarro = new Sandero(2015);
    }
}
