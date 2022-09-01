package br.com.likwi.designPattern.comportamentais.templateMethod.step02;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PagamentoDebito extends Pagamento {

    @Builder
    public PagamentoDebito(double valor, Gateway gateway, double valorFinal) {
        super(valor, gateway, valorFinal);
    }

    //calcula desconto
    @Override
    public double calcularDesconto() {
        //retorna o valor do pagamento com desconto de 5%
        return this.valor * 0.05;
    }

    @Override
    public double calcularTaxa() {
        return 4;
    }
}
