package io.github.WesleyViricimo.MedidasDoTrianguloComOOP;

import io.github.WesleyViricimo.MedidasDoTrianguloComOOP.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class MedidasDoTrianguloComOOP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Informe as medidas do triângulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Informe as medidas do triângulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triângulo x: %.4f%n", areaX); //%.4f%n é para imprimir o valor com 4 casas decimais
        System.out.printf("Área do triângulo y: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Maior área é a x");
        } else {
            System.out.println("Maior área é a y");
        }
    }
}
