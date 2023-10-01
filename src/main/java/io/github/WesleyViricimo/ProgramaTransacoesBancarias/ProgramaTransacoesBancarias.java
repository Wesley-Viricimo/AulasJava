package io.github.WesleyViricimo.ProgramaTransacoesBancarias;

import io.github.WesleyViricimo.ProgramaTransacoesBancarias.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaTransacoesBancarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta;

        System.out.print("Informe o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Informe o nome do títular da conta: ");
        String titularConta = sc.nextLine();
        System.out.print("Deseja realizar um depósito inicial? (s/n)");
        char resposta = sc.next().charAt(0);

        if(resposta == 's') {
            System.out.print("Informe o valor inicial da conta: ");
            double valorInicial = sc.nextDouble();
            conta = new Conta(numeroConta, titularConta, valorInicial);
        } else {
            conta = new Conta(numeroConta, titularConta);
        }

        System.out.println();

        System.out.println("informações da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe o valor de depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println("Informações da conta atualizadas:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe o valor de saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);

        System.out.println("Informações da conta atualizadas:");
        System.out.println(conta);

        sc.close();
    }
}
