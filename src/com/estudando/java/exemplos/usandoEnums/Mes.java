package com.estudando.java.exemplos.usandoEnums;

// AS CONSTANTES DA CLASSE ENUM SÃO OBJETOS

public enum Mes {
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    private int numMes;

    Mes(int numMes) {
        this.numMes = numMes;
    }

    public int getNumMes() {
        return this.numMes;
    }
}