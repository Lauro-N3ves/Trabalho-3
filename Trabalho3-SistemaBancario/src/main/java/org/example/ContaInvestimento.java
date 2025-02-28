package org.example;

public class ContaInvestimento extends ContaBancaria {

    public ContaInvestimento(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }


    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.02;
        double valorTotal = valor + taxa;
        if (valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$ " + valor + " realizado com taxa de R$ " + taxa + ". Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor + " (incluindo taxa).");
        }
    }
}