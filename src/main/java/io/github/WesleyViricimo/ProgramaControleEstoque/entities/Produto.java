package io.github.WesleyViricimo.ProgramaControleEstoque.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double totalValorEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
}
