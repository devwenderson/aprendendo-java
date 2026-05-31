package com.estudando.java.exemplos.interfaces;

public class InterfacesMain {
    public static void instanciarSandero(){
        // O TIPO DA VARIÁVEL PODE SER O NOME DA INTERFACE
        Carro meuCarro = new Sandero(2015);
        System.out.println(meuCarro);
    }
}
