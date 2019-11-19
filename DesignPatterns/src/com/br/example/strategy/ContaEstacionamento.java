package com.br.example.strategy;

public class ContaEstacionamento {
    private CalculoValor calculo;

    private Veiculo veiculo;
    private Long inicio;
    private Long fim;

    public double valorConta(){
        return calculo.calcular(fim-inicio, veiculo);
    }

    public void setCalculo(CalculoValor calculo) {
        this.calculo = calculo;
    }
}
