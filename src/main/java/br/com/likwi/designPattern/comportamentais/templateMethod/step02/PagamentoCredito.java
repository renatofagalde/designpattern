package br.com.likwi.designPattern.comportamentais.templateMethod.step02;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PagamentoCredito extends Pagamento {

    @Builder
    public PagamentoCredito(double valor, Gateway gateway, double valorFinal) {
        super(valor, gateway, valorFinal);
    }

    //calcula desconto
    @Override
    public double calcularDesconto() {
        //se o valor for maior que R$ 300 reais, retorna um desconto de 2%
        if (this.valor > 300) return this.valor * 0.02;
        return 0; // menor que R$ 300 reais não possuem desconto
    }

    @Override
    public double calcularTaxa() {
        return this.valor * 0.05;
    }

}
