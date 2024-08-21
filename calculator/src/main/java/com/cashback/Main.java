package com.cashback;

public class Main {
    public static void main(String[] args) {

        double valorCompra = 100.00;
        String grauFidelidade = "Ouro";

        double cashBack = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);

        System.out.println("O valor de cashback é: " + cashBack);
    }
}
