package br.com.likwi.designPattern.comportamentais.strategy;


import br.com.likwi.designPattern.Setup;
import br.com.likwi.designPattern.comportamentais.strategy.step01.Pedido;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PedidoStep01_Test extends Setup {

    static double VALOR_5=5d;
    static double VALOR_10=10d;
    static double VALOR_100=100d;

    @Test
    public void devolver_5_reais_para_frete_comum_ao_informar_100_reais(){

        Pedido pedido = new Pedido(VALOR_100);
        double deve_ser_5_reais = pedido.calcularFreteComum();
        assertThat(deve_ser_5_reais).as("O retorno deve ser %d para %d",VALOR_5,VALOR_100).isEqualTo(VALOR_5);

    }

    @Test
    public void devolver_10_reais_para_frete_expresso_ao_informar_100_reais(){

        Pedido pedido = new Pedido(VALOR_100);
        double deve_ser_10_reais = pedido.calcularFreteExpresso();
        assertThat(deve_ser_10_reais).as("O retorno deve ser %d para %d",VALOR_10,VALOR_100).isEqualTo(VALOR_10);

    }
}
