package io.github.WesleyViricimo.vetores.vetorAlturaIdade;

import java.util.Locale;
import java.util.Scanner;

public class VetorAlturaIdade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] vectN = new String[n];
        int[] vectI = new int[n];
        double [] vectA = new double[n];

        System.out.println("Informe os dados das pessoas: ");
        for(int i = 0; i < n; i++ ) {
            System.out.print("Nome: ");
            vectN[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectI[i] = sc.nextInt();
            System.out.print("Altura: ");
            vectA[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma = soma + vectA[i];
        }

        double alturaMedia = soma / n;

        System.out.println();
        System.out.printf("Altura média é de:  %.2f%n", alturaMedia);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if(vectI[i] < 16) {
                cont = cont + 1;
            }
        }

        double porcentagem = cont * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n", porcentagem);
    }
}
