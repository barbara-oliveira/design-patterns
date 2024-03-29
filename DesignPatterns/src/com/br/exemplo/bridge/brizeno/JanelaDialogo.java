package com.br.exemplo.bridge.brizeno;

public class JanelaDialogo extends JanelaAbstrata {

    public JanelaDialogo(JanelaImplementada janela) {
        super(janela);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
}
