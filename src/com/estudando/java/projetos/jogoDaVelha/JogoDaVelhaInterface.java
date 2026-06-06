package com.estudando.java.projetos.jogoDaVelha;

public interface JogoDaVelhaInterface {
    public String verificarVencedor(String jogadorDaVez);
    public void criarJogo();
    public void marcarTabuleiro(int index, String jogadorDaVez);
}
