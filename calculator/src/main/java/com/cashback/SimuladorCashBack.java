package com.cashback;

public class SimuladorCashBack {
    /**
     * Calcula o valor de cashback baseado no valor da compra e no grau de
     * fidelidade do cliente.
     * 
     * @param valorCompra    o valor total da compra
     * @param grauFidelidade o grau de fidelidade do cliente (Bronze, Prata,
     *                       Ouro)
     * @return o valor de cashback calculado
     */
    public static double calculaCashBack(double valorCompra, String grauFidelidade) {
        double descontoPorGrau = 0.0;
        double descontoPorValor = 0.0;

        double desconto = 0.0;

        switch (grauFidelidade) {
            case "bronze":
                descontoPorGrau = 0.0;
                break;
            case "Bronze":
                descontoPorGrau = 0.0;
                break;
            case "prata":
                descontoPorGrau = 0.05;
                break;
            case "Prata":
                descontoPorGrau = 0.05;
                break;
            case "ouro":
                descontoPorGrau = 0.1;
                break;
            case "Ouro":
                descontoPorGrau = 0.1;
                break;
            default:
                descontoPorGrau = 0.0;
                break;
        }
        if (valorCompra <= 0) {
            descontoPorValor = 0.0;
        }
        if (valorCompra < 100.00) {
            descontoPorValor = 0.05;
        } else if (valorCompra >= 100.01 && valorCompra <= 500.00) {
            descontoPorValor = 0.10;
        } else if (valorCompra > 500.00) {
            descontoPorValor = 0.15;
        }

        desconto = valorCompra * (descontoPorGrau + descontoPorValor);
        return desconto;
    }
}