package br.com.likwi.designPattern.comportamentais.strategy.step04;

import lombok.Getter;

@Getter
public abstract class Pedido {

    //as classes que herdam de pedido não se preocupam com o calculo do frete

    //2. Open-closed principle:
    // O Pedido não terá nenhum impacto em um novo tipo de frete seja aceito pelo e-commerce.
    // Bastaria criar uma nova classe de frete que implemente a interface Frete.

    private double valor;
    private Frete tipoFrete;

    public Pedido(double valor, Frete tipoFrete) {
        this.valor = valor;
        this.tipoFrete = tipoFrete;
    }

    public double calcularFrete(){
        return tipoFrete.calcular(this.valor);
    }
}
