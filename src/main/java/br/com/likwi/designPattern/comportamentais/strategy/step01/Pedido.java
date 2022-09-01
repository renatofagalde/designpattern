package br.com.likwi.designPattern.comportamentais.strategy.step01;

import lombok.Getter;

@Getter
public class Pedido {
    private double valor;

    public double calcularFreteComum() {
        return this.valor * 0.05;
    }

    public double calcularFreteExpresso() {
        return this.valor * 0.1;
    }

    public Pedido(double valor) {
        this.valor = valor;
    }

}
