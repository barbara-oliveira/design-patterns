package com.br.exemplo.strategy.casadocodigo;

public class CalculoDiaria implements CalculoValor {

    private double valorDiaria;

    public CalculoDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double calcular(Long periodo, Veiculo veiculo) {
        return valorDiaria * periodo;
    }
}
