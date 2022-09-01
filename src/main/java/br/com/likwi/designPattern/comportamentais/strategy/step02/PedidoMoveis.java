package br.com.likwi.designPattern.comportamentais.strategy.step02;

import lombok.Getter;

@Getter
public class PedidoMoveis extends Pedido {

    private String setor;

    public PedidoMoveis(double valor) {
        super(valor);
        this.setor = "Moveis";
    }

}
