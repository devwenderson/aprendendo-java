package com.estudando.java.projetos.comercio_eletronico;
import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private int estoque;
    private Categoria categoria;

    public Produto(int id, String descricao, double preco, int estoque, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }

    public String toString() {
        NumberFormat formatadorBr = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String preco = formatadorBr.format(this.preco);
        return "Produto {" + "\n" +
                " ID: " + this.id + "\n" +
                " Descrição: " + this.descricao + "\n" +
                " Preço: " + preco + "\n" +
                " Estoque: " + this.estoque + "\n" +
                " Categoria: " + this.categoria.getNome() + "\n" +
                "}";
    }

    // ----- SETTERS -----
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // ----- GETTERS -----
    public int getID() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }
}
