package br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step02;

import br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01.Pedido;

public class Pontos40 implements CalculadorPontos {

    private CalculadorPontos proximo;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 40) {
            return (int) pedido.getValor() / 7;
        }
        return this.proximo.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorPontos proximio) {
        this.proximo = proximio;
    }
}
