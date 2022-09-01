package br.com.likwi.designPattern.comportamentais.templateMethod.step02;

import lombok.Getter;

@Getter
public abstract class Pagamento {

    protected double valor;
    protected Gateway gateway;
    protected double valorFinal;

    public Pagamento(double valor, Gateway gateway, double valorFinal) {
        this.valor = valor;
        this.gateway = gateway;
        this.valorFinal = valorFinal;
    }

    protected abstract double calcularDesconto();


    // metodo hook,
    // para dinheiro não existe taxa
    public double calcularTaxa() {

        return 0;
    }
    
    //este é o método template methd
    //ele organiza a chama os metodos que serão implementados
    //pelas sub-classes
    public boolean realizarCobranca() {

        //calcula o valor total(valor do pagamento + taxa -desconto)
        double valorFinal = this.valor + calcularTaxa() - calcularDesconto();
        this.valorFinal = valorFinal;

        //delega a cobrança para o gateway
        return this.gateway.cobrar(valorFinal);
    }


}
