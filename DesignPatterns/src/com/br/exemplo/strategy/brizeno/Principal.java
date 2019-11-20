package com.br.exemplo.strategy.brizeno;

public class Principal {
    public static void main(String[] args) {

        Funcionario dba = new Funcionario("dba", 3400);
        System.out.println("O salário do "+ dba.getCargo()+" será "+dba.calcularSalarioComImposto());

        Funcionario gerente = new Funcionario("gerente", 3000);
        System.out.println("O salário do "+ gerente.getCargo()+" será "+gerente.calcularSalarioComImposto());
    }
}
