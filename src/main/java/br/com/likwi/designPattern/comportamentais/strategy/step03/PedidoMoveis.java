package br.com.likwi.designPattern.comportamentais.strategy.step03;

import lombok.Getter;

@Getter
public class PedidoMoveis extends Pedido {

    protected static String EXCEPTION_NO_IMPLEMENTED="Método não implementado";

    private String setor;

    @Override
    public double calcularFreteComum() {
        return this.getValor() * 0.05;
    }

    @Override
    public double calcularFreteExpresso() {
        throw new UnsupportedOperationException(EXCEPTION_NO_IMPLEMENTED);
    }

    public PedidoMoveis(double valor) {
        super(valor);
        this.setor = "Moveis";
    }

}
