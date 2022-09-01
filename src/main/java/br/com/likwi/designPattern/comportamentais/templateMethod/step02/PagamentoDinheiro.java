package br.com.likwi.designPattern.comportamentais.templateMethod.step02;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PagamentoDinheiro extends Pagamento {

    @Builder
    public PagamentoDinheiro(double valor, Gateway gateway, double valorFinal) {
        super(valor, gateway, valorFinal);
    }

    //calcula desconto
    public double calcularDesconto() {
        //retorna o valor do pagamento com desconto de 10%
        return this.valor * 0.1;
    }

}
