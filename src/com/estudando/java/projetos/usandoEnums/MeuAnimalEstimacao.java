package com.estudando.java.projetos.usandoEnums;

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
