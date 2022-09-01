package br.com.likwi.designPattern.comportamentais.strategy.step04;

import lombok.Getter;

@Getter
public class PedidoEletronico extends Pedido {

    private String setor;

    public PedidoEletronico(double valor,Frete frete) {
        super(valor,frete);
        this.setor = "Eletronico";
    }

//    @Override
//    public double calcularFreteComum() {
//        return this.getValor() * 0.05;
//    }
//
//    @Override
//    public double calcularFreteExpresso() {
//        throw new UnsupportedOperationException(EXCEPTION_NO_IMPLEMENTED);
//    }
}
