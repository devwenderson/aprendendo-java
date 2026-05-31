package com.estudando.java.projetos.calculadora;

public class CalculadoraMain {
    public static void instanceCalculadora(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(12, 3);
        int divisao = calculadora.divide(12, 4);

        System.out.println("Divisão: " + divisao);
        System.out.println("Soma: " + soma);
    }
}
