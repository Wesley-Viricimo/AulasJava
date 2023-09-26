package io.github.WesleyViricimo.ProgramaSalarioFuncionario.entities;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public double aumentoSalario(double aumento) {
        return salarioBruto * (aumento / 100);
    }

    public String toString() {
        return nome
                + ", Salário $ "
                + String.format("%.2f", salarioBruto)
                + ", imposto "
                + imposto
                + ", Salário líquido $"
                + String.format("%.2f", salarioLiquido());
    }
}
