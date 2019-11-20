package com.br.exemplo.strategy.casadocodigo;

public class Principal {
    public static void main(String[] args){
        //Diária
        Veiculo corsa = new Veiculo("corsa", "eduardo");
        ContaEstacionamento contaDoEduardo = new ContaEstacionamento(corsa, 10L,15L );
        contaDoEduardo.setCalculo(new CalculoDiaria(13.50));
        System.out.println("O "+corsa.getModelo()+" do "+corsa.getDono()+" pagou R$ "+contaDoEduardo.valorConta() +" para o estacionamento");

        //Mensal
        Veiculo palio = new Veiculo("palio", "julia");
        ContaEstacionamento contaDaJulia = new ContaEstacionamento(palio, 10L,15L );
        contaDaJulia.setCalculo(new CalculoMensal(130.50));
        System.out.println("O "+palio.getModelo()+" da "+palio.getDono()+" pagou R$ "+contaDaJulia.valorConta() +" para o estacionamento");
    }

}
