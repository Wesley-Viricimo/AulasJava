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
        System.out.print("Name: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        sc.close();
    }
}
