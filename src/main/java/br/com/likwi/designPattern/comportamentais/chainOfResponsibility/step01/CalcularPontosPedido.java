package br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01;

public class CalcularPontosPedido {

    public static int calcularPontosPedido(Pedido pedido, int dia) {

        int pontos = 0;

        if (pedido.getValor() >= 70) {
            pontos = (int) pedido.getValor() / 5;
        } else if (pedido.getValor() >= 40) {
            pontos = (int) pedido.getValor() / 7;
        } else if (pedido.getValor() >= 20) {
            pontos = (int) pedido.getValor() / 10;
        } else {
            return pontos;
        }

        if (dia >= 16 && dia <= 31) {
            return pontos * 2;
        }

        return pontos;
    }
}
