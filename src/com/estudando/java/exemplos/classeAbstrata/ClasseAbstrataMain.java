package com.estudando.java.exemplos.classeAbstrata;

public class ClasseAbstrataMain {
    public static void instanceHumano(){
        float altura = 1.63f;
        int idade = 14;
        String nome = "Pedro";
        String raca = "Humano";
        SerVivo pedro = new Humano(idade, nome, raca, altura);
        String humano_raca = pedro.getRaca();
        System.out.println(humano_raca);
    }
}
