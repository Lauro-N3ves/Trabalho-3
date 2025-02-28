package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento {

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.05;
        double valorTotal = valor + taxa;
        if (saldo >= 10000 && valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$ " + valor + " realizado com taxa de R$ " + taxa + ". Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo mínimo não atingido ou saldo insuficiente para saque de R$ " + valor + " (incluindo taxa).");
        }
    }
}