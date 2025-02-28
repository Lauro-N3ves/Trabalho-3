package org.example;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("11111", "Lauro", 5000, 1000);
        ContaPoupanca cp = new ContaPoupanca("22222", "Lauzon", 3000);
        ContaInvestimento ci = new ContaInvestimento("33333", "Brauzon", 10000);
        ContaSalario cs = new ContaSalario("44444", "Rogerinho", 2000, 500);
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("55555", "Dmitry", 15000);

        System.out.println("         Conta Corrente         ");
        cc.exibirInformacoes();
        cc.sacar(1300);
        cc.depositar(200);

        System.out.println("\n         Conta Poupança         ");
        cp.exibirInformacoes();
        cp.sacar(2500);
        cp.sacar(1500);

        System.out.println("\n        Conta Investimento         ");
        ci.exibirInformacoes();
        ci.sacar(1000);

        System.out.println("\n         Conta Salário         ");
        cs.exibirInformacoes();
        cs.sacar(500);
        cs.sacar(200);

        System.out.println("\n      Conta Investimento de Alto Risco        ");
        ciar.exibirInformacoes();
        ciar.sacar(5000);
    }
}