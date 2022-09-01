package br.com.likwi.designPattern.comportamentais.strategy.step02;

import lombok.Getter;

@Getter
public class PedidoEletronico extends Pedido {

    private String setor;

    public PedidoEletronico( double valor) {
        super(valor);
        this.setor = "Eletronico";
    }
}
