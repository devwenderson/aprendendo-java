import com.estudando.java.projetos.calculadora.Calculadora;
import com.estudando.java.exemplos.classeAbstrata.Humano;
import com.estudando.java.exemplos.classeAbstrata.SerVivo;
import com.estudando.java.projetos.comercio_eletronico.Cliente;
import com.estudando.java.projetos.comercio_eletronico.Categoria;
import com.estudando.java.projetos.comercio_eletronico.Produto;


public class Main {
    public static void main(String[] args) {
        instanceComercioEletronico();
    }

    // ================= TESTE COMERCIO ELETRÔNICO =================
    public static void instanceComercioEletronico() {
        int cli_id = 1;
        String cli_nome = "Wenderson";
        String cli_telefone = "(84) 91234-5678";
        String cli_email = "wenderson@email.com";
        Cliente wenderson = new Cliente(cli_id, cli_nome, cli_telefone, cli_email);

        int cat_id = 1;
        String cat_nome = "Eletrônico";
        Categoria eletronico = new Categoria(cat_id, cat_nome);

        int pro_id = 1;
        String pro_descicao = "Galaxy S20 FE";
        double pro_preco = 1699.99;
        int pro_estoque = 70;

        Produto galaxy = new Produto(pro_id, pro_descicao, pro_preco, pro_estoque, eletronico);

        System.out.println(galaxy);
    }

    // ================= TESTES =================

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

    public static void instanceCliente() {
        Cliente pedro = new Cliente(1, "Pedro", "(84) 91234-5678", "Pedro@email");
        System.out.println(pedro);
    }

    public static void instanceCalculadora(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(12, 3);
        int divisao = calculadora.divide(12, 4);

        System.out.println("Divisão: " + divisao);
        System.out.println("Soma: " + soma);
    }
}