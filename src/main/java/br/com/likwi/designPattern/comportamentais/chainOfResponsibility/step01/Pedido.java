package br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01;

import lombok.Getter;

@Getter
public class Pedido {
    private float valor;

    public Pedido(float valor) {
        this.valor = valor;
    }
}
