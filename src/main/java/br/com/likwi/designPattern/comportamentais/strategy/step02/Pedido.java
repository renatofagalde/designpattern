package br.com.likwi.designPattern.comportamentais.strategy.step02;

import lombok.Getter;

@Getter
public abstract class Pedido {

    private double valor;
    public Pedido(double valor) {
        this.valor = valor;
    }

    public double calcularFreteComum() {
        return this.valor * 0.05;
    }

    public double calcularFreteExpresso() {
        return this.valor * 0.1;
    }


}
