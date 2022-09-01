package br.com.likwi.designPattern.comportamentais.templateMethod.step01;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PagamentoDinheiro {
    private double valor;
    private Gateway gateway;
    private double valorFinal;

    // calcular taxa da gateway
    public double calcularTaxa() {

        // pagamento em dinheiro não possui taxa
        return 0;
    }

    //calcula desconto
    public double calcularDesconto() {

        //retorna o valor do pagamento com desconto de 10%
        return this.valor * 0.1;

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
