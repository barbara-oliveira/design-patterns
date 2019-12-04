package com.br.exemplo.templatemethod.devmedia;

public abstract class Treinos {
    final void treinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    abstract void preparoFisico();
    abstract void jogoTreino();

    final void treinoTatico(){
        System.out.println("Treino tático");
    }
}
