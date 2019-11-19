package com.br.example.strategy;

public class CalculoDiaria implements CalculoValor {

    private double valorDiaria;
    private int hora;

    public CalculoDiaria(double valorDiaria, int hora) {
        this.valorDiaria = valorDiaria;
        this.hora = hora;
    }

    public double calcular(Long periodo, Veiculo veiculo) {
        return valorDiaria * Math.ceil(periodo/hora);
    }
}
