package com.br.exemplo.strategy.brizeno;

public class CalculoImpostoQuinzeOuDez implements CalculaImposto {

    @Override
    public double calcularSalarioImposto(Funcionario funcionario) {
        if(funcionario.getSalarioBase() >= 2000){
            return funcionario.getSalarioBase() * 0.85;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }
}
