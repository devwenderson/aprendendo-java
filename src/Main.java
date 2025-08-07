import com.estudando.java.projetos.calculadora.Calculadora;
import com.estudando.java.exemplos.classeAbstrata.Humano;
import com.estudando.java.exemplos.classeAbstrata.SerVivo;


public class Main {
    public static void main(String[] args) {
        instanceCalculadora();
    }

    // STATIC SERVE PARA DIZER QUE UM MÉTODO
    // OU VARIÁVEL NÃO PRECISA DE OBJETO PARA SER EXECUTADO
    public static void instanceHumano(){
        float altura = 1.63f;
        int idade = 14;
        String nome = "Pedro";
        String raca = "Humano";
        SerVivo pedro = new Humano(idade, nome, raca, altura);
        String humano_raca = pedro.getRaca();
        System.out.println(humano_raca);
    }

    public static void instanceCalculadora(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(12, 3);
        int divisao = calculadora.divide(12, 4);

        System.out.println("Divisão: " + divisao);
        System.out.println("Soma: " + soma);
    }
}