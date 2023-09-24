package io.github.WesleyViricimo.MedidasTrianguloSemOOP;

import java.util.Locale;
import java.util.Scanner;

public class MedidasDoTrianguloSemOOP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Informe as medidas do triângulo x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Informe as medidas do triângulo y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p * xB) * (p * xC)); //Função Math.sqrt é para encontrar raiz quadrada

        p = (xA + xB + xC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p * yB) * (p * yC)); //Função Math.sqrt é para encontrar raiz quadrada

        System.out.printf("Área do triângulo x: %.4f%n", areaX); //%.4f%n é para imprimir o valor com 4 casas decimais
        System.out.printf("Área do triângulo y: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Maior área é a x");
        } else {
            System.out.println("Maior área é a y");
        }
    }
}
