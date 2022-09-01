package br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step02;

import br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01.Pedido;

public class CalcularPontosPedido {

    public static int calcularPontosPedido(Pedido pedido, int dia) {

        final Pontos70 pontos70 = new Pontos70();
        final Pontos40 pontos40 = new Pontos40();
        final Pontos20 pontos20 = new Pontos20();
        final Pontos0 pontos0 = new Pontos0();

        pontos70.setProximo(pontos40);
        pontos40.setProximo(pontos20);
        pontos20.setProximo(pontos0);

        if (dia >= 16 && dia <= 31) {
            return pontos70.calcularPontos(pedido)*2;
        }

        return pontos70.calcularPontos(pedido);
    }
}
