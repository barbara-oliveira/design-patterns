package com.br.exemplo.bridge.brizeno;

public class Principal {
    public static void main(String[] args){
            JanelaAbstrata janela = new JanelaDialogo(new JanelaWindows());
            janela.desenhar();
            janela = new JanelaAviso(new JanelaWindows());
            janela.desenhar();

            janela = new JanelaDialogo(new JanelaWindows());
            janela.desenhar();
    }
}
