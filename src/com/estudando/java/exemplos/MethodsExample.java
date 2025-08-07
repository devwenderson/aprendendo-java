package com.estudando.java.exemplos;
// NÃO PODE DUAS CLASSES PÚBLICAS NO MESMO ARQUIVO

public class MethodsExample {
    protected void mensagemProtected(){
        System.out.println("Esse método só pode ser acessado dentro do mesmo pacote");
    }

    private void mensagemPrivada(){
        System.out.println("Esse método só pode ser acessado dentro da mesma classe");
    }

    public void mensagem3(){
        this.mensagemPrivada();
    }
}

// A CLASSE FICA SEM MODIFICADOR DE ACESSO MESMO
class Example {
    public void mensagem(){
        MethodsExample example = new MethodsExample();
        example.mensagemProtected();
    }
}


