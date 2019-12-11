package com.br.exemplo.bridge.fpierin;

public class Homologador implements Colaborador {
    private Tarefa tarefa;

    public Homologador(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void produz() {
        System.out.println("nHomologador trabalhando ");
        tarefa.realiza();
    }

    @Override
    public void recebeTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
