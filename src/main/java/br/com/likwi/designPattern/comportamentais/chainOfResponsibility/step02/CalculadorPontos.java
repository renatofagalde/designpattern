package br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step02;


import br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01.Pedido;

public interface CalculadorPontos {
    int calcularPontos(Pedido pedido);
    void setProximo(CalculadorPontos proximio);
}
