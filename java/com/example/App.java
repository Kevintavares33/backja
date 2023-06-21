package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        CriaConta santander = new CriaConta(33, 133, 100, "kevin");

        santander.deposito(333);

        System.out.println("seu saldo Santander é de:" + santander.saldo);

        santander.saque(33);

        System.out.println("seu saldo é de:" + santander.saldo);

        CriaConta itau = new CriaConta(12, 123, 0, "luana");

        itau.deposito(3000);

        System.out.println("Seu saldo conta itau é de:" + itau.saldo);
    }
}
