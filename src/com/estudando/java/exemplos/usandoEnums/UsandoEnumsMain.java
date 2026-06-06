package com.estudando.java.exemplos.usandoEnums;

public class UsandoEnumsMain {
    public static void listarMeses() {
        for (Mes mes : Mes.values()) {
            System.out.println(mes.getNumMes() + " " + mes);
        }
    }

    public static void criarAnimalEstimacao() {
        falar(MeuAnimalEstimacao.GATO);
        falar(MeuAnimalEstimacao.CACHORRO);
    }

    public static void falar(AnimalEstimacao animalEstimacao) {
        System.out.println(animalEstimacao.falar());
    }
}
