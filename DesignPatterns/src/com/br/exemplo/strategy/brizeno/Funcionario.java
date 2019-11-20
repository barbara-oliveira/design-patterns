package com.br.exemplo.strategy.brizeno;

public class Funcionario {
    double salarioBase;
    String cargo;
    CalculaImposto estrategiaDeCalculo;

    public Funcionario(String cargo, double salarioBase){
        this.salarioBase = salarioBase;
        this.cargo = cargo;
        switch (cargo){
            case "desenvolvedor":
                estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
                break;
            case "dba":
                estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
                break;
            case "gerente":
                estrategiaDeCalculo = new CalculoImpostoVinteOuQuinze();
                break;
            default:
                throw new RuntimeException("Cargo não encontrado :/");
        }
    }

    public double calcularSalarioComImposto(){
        return estrategiaDeCalculo.calcularSalarioImposto(this);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return cargo;
    }
}
