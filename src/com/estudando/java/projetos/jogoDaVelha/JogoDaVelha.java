package com.estudando.java.projetos.jogoDaVelha;

public class JogoDaVelha implements JogoDaVelhaInterface {
    public String jogadorX;
    public String jogadorO;
    public String[][] tabuleiro;
    public int tamTabuleiro;

    public JogoDaVelha() {
        this.jogadorO = "O";
        this.jogadorX = "X";
        this.tamTabuleiro = 3;
        this.criarJogo();
    }


    @Override
    public String verificarVencedor(String jogadorDaVez) {
        int qtdIgual = 0;
        String vencedor = " ";

        // VERIFICAÇÃO HORIZONTAL
        for (int i=0; i<tamTabuleiro; ++i) {
            for (int j=0; j<tamTabuleiro; ++j) {
                if (jogadorDaVez.equals(tabuleiro[i][j])) {
                    qtdIgual = qtdIgual + 1;
                } else {
                    qtdIgual = 0;
                }
            }
            if (qtdIgual == 3) {
                vencedor = jogadorDaVez;
                break;
            }
        }

        // VERIFICAÇÃO VERTICAL
        for (int i=0; i<tamTabuleiro; ++i) {
            for (int j=0; j<tamTabuleiro; ++j) {
                if (jogadorDaVez.equals(tabuleiro[j][i])) {
                    qtdIgual = qtdIgual + 1;
                } else {
                    qtdIgual = 0;
                }
            }
            if (qtdIgual == 3) {
                vencedor = jogadorDaVez;
                break;
            }
        }

        // VERIFICAÇÃO DIAGONAL ESQUERDA
        if (jogadorDaVez.equals(tabuleiro[0][0])
            && jogadorDaVez.equals(tabuleiro[1][1])
            && jogadorDaVez.equals(tabuleiro[2][2])
        ) {

            vencedor = jogadorDaVez;
        }

        // VERIFICAÇÃO DIAGONAL DIREITA
        if (jogadorDaVez.equals(tabuleiro[0][2])
            && jogadorDaVez.equals(tabuleiro[1][1])
            && jogadorDaVez.equals(tabuleiro[2][0])
        ) {
            vencedor = jogadorDaVez;
        }

        // VERIFICAÇÃO VELHA
        int qtdDiferente = 0;
        for (int i=0; i<tamTabuleiro; ++i) {
            for (int j=0; j<tamTabuleiro; ++j) {
                if (!tabuleiro[i][j].equals(" ")) {
                    qtdDiferente = qtdDiferente + 1;
                }
            }
            if (qtdDiferente == 9) {
                vencedor = "VELHA";
                break;
            }
        }

        return vencedor;
    }

    @Override
    public void criarJogo() {
        this.tabuleiro = new String[tamTabuleiro][tamTabuleiro];
        for (int i=0; i<tamTabuleiro; ++i) {
            for (int j=0; j<tamTabuleiro; ++j) {
                this.tabuleiro[i][j] = " ";
            }
        }
    }

    @Override
    public void marcarTabuleiro(int index, String jogadorDaVez) {
        int x, y;
        x = (index-1) / this.tamTabuleiro;
        y = (index-1) % this.tamTabuleiro;

        if (tabuleiro[x][y].equals(" ")) {
            tabuleiro[x][y] = jogadorDaVez;
        }

    }
}