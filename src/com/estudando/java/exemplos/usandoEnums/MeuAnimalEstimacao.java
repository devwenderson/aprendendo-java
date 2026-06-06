package com.estudando.java.exemplos.usandoEnums;

// AS CONSTANTES DA CLASSE ENUM SÃO OBJETOS

public enum MeuAnimalEstimacao implements AnimalEstimacao {
    GATO {
        @Override
        public String falar() {
            return "Miau!";
        }
    },

    CACHORRO {
        @Override
        public String falar() {
            return "AuAu!";
        }
    }; 
}
