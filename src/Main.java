// PROJETOS
import com.estudando.java.projetos.calculadora.CalculadoraMain;
import com.estudando.java.projetos.comercio_eletronico.ComercioEletronicoMain;
import com.estudando.java.projetos.jogoDaVelha.JogoDaVelhaMain;

// EXEMPLOS
import com.estudando.java.exemplos.classeAbstrata.ClasseAbstrataMain;
import com.estudando.java.exemplos.interfaces.InterfacesMain;
import com.estudando.java.exemplos.usandoEnums.UsandoEnumsMain;

/* 
CRIEI ARQUIVOS *MAIN* EM CADA PACKAGE PARA FACILITAR A CRIAÇÃO DE TESTES.
CADA ARQUIVO *MAIN* TEM OS TESTES DO PACKAGE ONDE ESTÁ INSERIDO 
*/

public class Main {
    /* 
    ================= TESTES =================
    *STATIC* SERVE PARA DIZER QUE UM MÉTODO OU 
    VARIÁVEL NÃO PRECISA DE OBJETO PARA SER EXECUTADO
    ==========================================
    */

    public static void main(String[] args) {
        JogoDaVelhaMain.iniciarJogo();
    }
}