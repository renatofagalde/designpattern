package br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step02;

import br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01.Pedido;

public class Pontos0 implements CalculadorPontos {

    private CalculadorPontos proximo;

    @Override
    public int calcularPontos(Pedido pedido) {
        return 0;
    }

    @Override
    public void setProximo(CalculadorPontos proximio) {
        //
    }
}
