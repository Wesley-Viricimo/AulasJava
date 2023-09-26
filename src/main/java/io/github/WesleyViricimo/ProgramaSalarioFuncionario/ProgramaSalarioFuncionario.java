package io.github.WesleyViricimo.ProgramaSalarioFuncionario;

import io.github.WesleyViricimo.ProgramaSalarioFuncionario.entities.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaSalarioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empregado empregado = new Empregado();

        System.out.println("Forneça informações sobre o funcionário: ");
        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        empregado.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Informações do funcionário: " + empregado);

        System.out.println();
        System.out.print("Informe o percentual de aumento do salário bruto: ");
        double aumento = sc.nextDouble();
        empregado.aumentoSalario(aumento);

        System.out.println();
        System.out.println("Informações do funcionário: " + empregado);

    }
}
