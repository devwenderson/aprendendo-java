package com.estudando.java.projetos.jogoDaVelha;

import java.util.Scanner;

public class JogoDaVelhaMain {
    public static void iniciarJogo() {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        Scanner scan = new Scanner(System.in);

        String vencedor = " ";
        int numCasa;
        int jogador = 0;
        String[] jogadores = {jogoDaVelha.jogadorO, jogoDaVelha.jogadorX};
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("[Jogador]: " + jogadores[jogador]);
            exibirJogo(jogoDaVelha);
            System.out.print("[Numero da casa]: ");
            numCasa = scan.nextInt();

            jogoDaVelha.marcarTabuleiro(numCasa, jogadores[jogador]);
            vencedor = jogoDaVelha.verificarVencedor(jogadores[jogador]);

            if (!vencedor.equals(" ")) {
                isRunning = false;
            }

            jogador = mudarJogador(jogador);
        }

        exibirJogo(jogoDaVelha);
        System.out.println("Vencedor: " + vencedor);

    }

    public static void exibirJogo(JogoDaVelha jogoDaVelha) {
        for (int i=0; i<jogoDaVelha.tamTabuleiro; ++i) {
            for (int j=0; j<jogoDaVelha.tamTabuleiro; ++j) {
                System.out.print("|" + jogoDaVelha.tabuleiro[i][j] + "|");
            }
            System.out.println(" ");
        }
    }

    public static int mudarJogador(int jogador) {
        if (jogador == 0) {
            jogador = 1;
        } else {
            jogador = 0;
        }
        return jogador;
    }
}
