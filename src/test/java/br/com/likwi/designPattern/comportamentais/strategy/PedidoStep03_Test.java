package br.com.likwi.designPattern.comportamentais.strategy;


import br.com.likwi.designPattern.Setup;
import br.com.likwi.designPattern.comportamentais.strategy.step03.PedidoEletronico;
import br.com.likwi.designPattern.comportamentais.strategy.step03.PedidoMoveis;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PedidoStep03_Test extends Setup {

    static double VALOR_5=5d;
    static double VALOR_10=10d;
    static double VALOR_100=100d;

    @Test
    public void devolver_5_reais_para_frete_comum_ao_informar_100_reais_para_um_pedido_eletronico(){

        PedidoEletronico pedido = new PedidoEletronico(VALOR_100);
        double deve_ser_5_reais = pedido.calcularFreteComum();
        assertThat(deve_ser_5_reais)
                .as("O retorno deve ser %d para %d para um pedido do tipo: %s",
                        VALOR_5,VALOR_100,pedido.getSetor()).isEqualTo(VALOR_5);
    }

    @Test
    public void devolver_10_reais_para_frete_expresso_ao_informar_100_reais_para_um_pedido_eletronico(){

        PedidoEletronico pedido = new PedidoEletronico(VALOR_100);
        double deve_ser_10_reais = pedido.calcularFreteExpresso();
        assertThat(deve_ser_10_reais)
                .as("O retorno deve ser %d para %d para um pedido do tipo: %s",
                        VALOR_10,VALOR_100,pedido.getSetor()).isEqualTo(VALOR_10);
    }

    @Test
    public void devolver_5_reais_para_frete_comum_ao_informar_100_reais_para_um_pedido_moveis(){

        PedidoMoveis pedido = new PedidoMoveis(VALOR_100);
        double deve_ser_5_reais = pedido.calcularFreteComum();
        assertThat(deve_ser_5_reais)
                .as("O retorno deve ser %d para %d para um pedido do tipo: %s",
                        VALOR_5,VALOR_100,pedido.getSetor()).isEqualTo(VALOR_5);
    }

    @Test
    public void devolver_receber_excecao_UnsupportedOperationException_para_calcular_frete_da_classe_moveis(){

        Assertions.assertThatExceptionOfType(UnsupportedOperationException.class)
                .isThrownBy(()->{
                    PedidoMoveis pedido = new PedidoMoveis(VALOR_100);
                    double deve_ser_10_reais = pedido.calcularFreteExpresso();
                    assertThat(deve_ser_10_reais)
                            .as("O retorno deve ser %d para %d para um pedido do tipo: %s",
                                    VALOR_10,VALOR_100,pedido.getSetor()).isEqualTo(VALOR_10);

                }).withMessage("Método não implementado");
    }

}
