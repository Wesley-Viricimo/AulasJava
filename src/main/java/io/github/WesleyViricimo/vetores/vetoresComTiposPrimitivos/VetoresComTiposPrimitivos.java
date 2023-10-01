package io.github.WesleyViricimo.vetores.vetoresComTiposPrimitivos;

import java.util.Locale;
import java.util.Scanner;

public class VetoresComTiposPrimitivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n]; //Abre e fecha colchetes indica que variável é um vetor

        for(int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("Média de altura é: %.2f%n", media);

        sc.close();
    }
}
