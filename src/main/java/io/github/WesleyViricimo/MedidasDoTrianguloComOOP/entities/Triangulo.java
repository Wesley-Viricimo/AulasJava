package io.github.WesleyViricimo.MedidasDoTrianguloComOOP.entities;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Função Math.sqrt é para encontrar raiz quadrada
    }
}
