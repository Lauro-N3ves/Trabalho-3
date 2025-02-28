package org.example;

public class ContaSalario extends ContaCorrente {
    private int saquesGratuitosRestantes;


    public ContaSalario(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial, limiteChequeEspecial);
        this.saquesGratuitosRestantes = 1; // 1 saque gratuito por mês
    }


    @Override
    public void sacar(double valor) {
        if (saquesGratuitosRestantes > 0) {
            super.sacar(valor);
            saquesGratuitosRestantes--;
        } else {
            double taxa = 5.0;
            if (valor + taxa <= saldo) {
                saldo -= (valor + taxa);
                System.out.println("Saque de R$ " + valor + " realizado com taxa de R$ " + taxa + ". Novo saldo: R$ " + saldo);
            } else {
                System.out.println("Saldo insuficiente para saque de R$ " + valor + " (incluindo taxa).");
            }
        }
    }


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Saques gratuitos restantes: " + saquesGratuitosRestantes);
    }
}