package com.br.exemplo.strategy.casadocodigo;

public class CalculoMensal implements CalculoValor {

    double valorMensal;

    public CalculoMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    @Override
    public double calcular(Long periodo, Veiculo veiculo) {
        return valorMensal + periodo;
    }
}
