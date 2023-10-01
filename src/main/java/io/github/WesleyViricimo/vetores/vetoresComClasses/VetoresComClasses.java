package io.github.WesleyViricimo.vetores.vetoresComClasses;

import io.github.WesleyViricimo.vetores.vetoresComClasses.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class VetoresComClasses {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Informe o nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Informe o preço do produto: ");
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double soma = 0.0;

        for(int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("Media dos preços dos produtos: %.2f%n", media);


        sc.close();
    }
}
