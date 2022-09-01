package br.com.likwi.designPattern.comportamentais.strategy.step03;

import lombok.Getter;

@Getter
public class PedidoEletronico extends Pedido {

    private String setor;

    @Override
    public double calcularFreteComum() {
        return this.getValor()*0.05;
    }

    @Override
    public double calcularFreteExpresso() {
        return this.getValor()*0.1;
    }

    public PedidoEletronico(double valor) {
        super(valor);
        this.setor = "Eletronico";
    }
}
