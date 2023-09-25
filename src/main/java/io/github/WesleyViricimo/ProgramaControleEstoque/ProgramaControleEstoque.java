package io.github.WesleyViricimo.ProgramaControleEstoque;

import io.github.WesleyViricimo.ProgramaControleEstoque.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaControleEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Forneça informações sobre o produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Informações do produto: " + produto);

        System.out.println();
        System.out.print("Informe a quantidade de produtos para ser adicionado ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Informações do produto atualizado: " + produto);

        System.out.println();
        System.out.print("Informe a quantidade de produtos para ser removido do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Informações do produto atualizado: " + produto);

        sc.close();
    }
}
