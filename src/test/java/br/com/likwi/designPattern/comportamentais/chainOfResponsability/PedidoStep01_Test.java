package br.com.likwi.designPattern.comportamentais.chainOfResponsability;

import br.com.likwi.designPattern.Setup;
import br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01.CalcularPontosPedido;
import br.com.likwi.designPattern.comportamentais.chainOfResponsibility.step01.Pedido;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PedidoStep01_Test extends Setup {

    private static int DIA_15 = 15;
    private static int DIA_16 = 16;
    private static float VALOR_21 = 21;
    private static float VALOR_100 = 100;

    private static int PONTOS_2 = 2;
    private static int PONTOS_4 = 4;
    private static int PONTOS_20 = 20;
    private static int PONTOS_40 = 40;


    @Test
    public void devolver_2_pontos_ao_informar_dia_15_e_21_reais() {
        final Pedido pedido = new Pedido(VALOR_21);
        final int pontos = CalcularPontosPedido.calcularPontosPedido(pedido, DIA_15);

        assertThat(PONTOS_2).as("Deve devolver %d pontos ao informar o valor %d no dia %d",
                PONTOS_2, VALOR_21, DIA_15).isEqualTo(pontos);
    }

    @Test
    public void devolver_4_pontos_ao_informar_dia_16_e_21_reais() {
        final Pedido pedido = new Pedido(VALOR_21);
        final int pontos = CalcularPontosPedido.calcularPontosPedido(pedido, DIA_16);

        assertThat(PONTOS_4).as("Deve devolver %d pontos ao informar o valor %d no dia %d",
                PONTOS_4, VALOR_21, DIA_16).isEqualTo(pontos);

    }

    @Test
    public void devolver_20_pontos_ao_informar_dia_15_e_21_reais() {
        final Pedido pedido = new Pedido(VALOR_100);
        final int pontos = CalcularPontosPedido.calcularPontosPedido(pedido, DIA_15);

        assertThat(PONTOS_20).as("Deve devolver %d pontos ao informar o valor %d no dia %d",
                PONTOS_20, VALOR_100, DIA_15).isEqualTo(pontos);
    }

    @Test
    public void devolver_40_pontos_ao_informar_dia_16_e_100_reais() {
        final Pedido pedido = new Pedido(VALOR_100);
        final int pontos = CalcularPontosPedido.calcularPontosPedido(pedido, DIA_16);

        assertThat(PONTOS_40).as("Deve devolver %d pontos ao informar o valor %d no dia %d",
                PONTOS_40, VALOR_100, DIA_16).isEqualTo(pontos);
    }
}
