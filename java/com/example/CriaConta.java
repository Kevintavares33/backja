package com.example;

public class CriaConta {
    int ag;
    int conta;
    double saldo;
    String usuario;

    public CriaConta(int ag, int conta, double saldo, String usuario) {
        this.ag = ag;
        this.conta = conta;
        this.saldo = saldo;
        this.usuario = usuario;

    }

    public void deposito(double valor) {
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;

        } else {
            System.out.println("seu saldo é insuficiente");
        }
    }

}
