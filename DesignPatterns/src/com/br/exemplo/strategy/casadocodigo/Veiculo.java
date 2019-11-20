package com.br.exemplo.strategy.casadocodigo;

public class Veiculo {
    private String modelo;
    private String dono;

    public Veiculo(String modelo, String dono) {
        this.modelo = modelo;
        this.dono = dono;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDono() {
        return dono;
    }
}
