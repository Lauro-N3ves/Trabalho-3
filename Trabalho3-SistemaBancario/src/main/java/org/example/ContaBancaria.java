package org.example;

public abstract class ContaBancaria {

    private String numeroConta;
    private String titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método abstrato para sacar (será implementado nas subclasses)
    public abstract void sacar(double valor);

    // Método concreto para exibir informações
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}