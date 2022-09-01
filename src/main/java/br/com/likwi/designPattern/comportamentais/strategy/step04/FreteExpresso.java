package br.com.likwi.designPattern.comportamentais.strategy.step04;

public class FreteExpresso implements Frete{
    @Override
    public double calcular(double valor) {
        return valor *0.1;
    }
}
