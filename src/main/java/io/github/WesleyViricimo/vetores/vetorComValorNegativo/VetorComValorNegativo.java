package io.github.WesleyViricimo.vetores.vetorComValorNegativo;

import java.util.Locale;
import java.util.Scanner;

public class VetorComValorNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quando números irá digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for(int i = 0; i < n; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
