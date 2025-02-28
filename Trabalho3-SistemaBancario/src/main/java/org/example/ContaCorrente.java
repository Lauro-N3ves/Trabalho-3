package org.example;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    // Construtor
    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteChequeEspecial;
        if (valor <= saldoDisponivel) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite do Cheque Especial: R$ " + limiteChequeEspecial);
    }
}