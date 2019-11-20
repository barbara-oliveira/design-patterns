package com.br.exemplo.strategy.brizeno;

public class CalculoImpostoVinteOuQuinze implements CalculaImposto {
    @Override
    public double calcularSalarioImposto(Funcionario funcionario) {
        if(funcionario.getSalarioBase() >= 3500) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
