package com.estudando.java.projetos.comercio_eletronico;

public class ComercioEletronicoMain {
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

        System.out.println(wenderson);
        System.out.println(galaxy);
    }

    public static void instanceCliente() {
        Cliente pedro = new Cliente(1, "Pedro", "(84) 91234-5678", "Pedro@email");
        System.out.println(pedro);
    }
}
