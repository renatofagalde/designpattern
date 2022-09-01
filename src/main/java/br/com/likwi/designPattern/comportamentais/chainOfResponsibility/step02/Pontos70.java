package br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step02;

import br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01.Pedido;

public class Pontos70 implements CalculadorPontos {

    private CalculadorPontos proximo;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 70) {
            return (int) pedido.getValor() / 5;
        }
        return this.proximo.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorPontos proximio) {
        this.proximo = proximio;
    }
}
