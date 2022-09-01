package br.com.likwi.designPattern.comportamentais.templateMethod.step01;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PagamentoCredito {
    private double valor;
    private Gateway gateway;
    private double valorFinal;

    // calcular taxa da gateway
    public double calcularTaxa() {

        // retorna uma taxa de 5%
        return this.valor * 0.05;
    }

    //calcula desconto
    public double calcularDesconto() {
        //se o valor for maior que R$ 300 reais, retorna um desconto de 2%
        if (this.valor > 300) return this.valor * 0.02;
        return 0; // menor que R$ 300 reais não possuem desconto
    }

    //realizar cobranca
    public boolean realizarCobranca() {

        //calcula o valor total(valor do pagamento + taxa -desconto)
        double valorFinal = this.valor + calcularTaxa() - calcularDesconto();
        this.valorFinal = valorFinal;

        //delega a cobrança para o gateway
        return this.gateway.cobrar(valorFinal);
    }
}
