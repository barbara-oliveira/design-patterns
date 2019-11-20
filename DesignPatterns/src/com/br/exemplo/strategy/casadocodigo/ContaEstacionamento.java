package com.br.exemplo.strategy.casadocodigo;

public class ContaEstacionamento {
    private CalculoValor calculo;

    private Veiculo veiculo;
    private Long inicio;
    private Long fim;

    public ContaEstacionamento(Veiculo veiculo, Long inicio, Long fim) {
        this.veiculo = veiculo;
        this.inicio = inicio;
        this.fim = fim;
    }

    public double valorConta(){
        return calculo.calcular(fim-inicio, veiculo);
    }

    public void setCalculo(CalculoValor calculo) {
        this.calculo = calculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
