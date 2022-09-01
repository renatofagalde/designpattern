package br.com.likwi.designPattern.comportamentais.strategy.step03;

import lombok.Getter;

@Getter
public abstract class Pedido {
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public abstract double calcularFreteComum();

    public abstract double calcularFreteExpresso();


}
