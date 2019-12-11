package com.br.exemplo.bridge.fpierin;

public class Programador implements Colaborador {
    private Tarefa tarefa;

    public Programador(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void produz() {
        System.out.println("Programador trabalhando ");
        tarefa.realiza();
    }

    @Override
    public void recebeTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
