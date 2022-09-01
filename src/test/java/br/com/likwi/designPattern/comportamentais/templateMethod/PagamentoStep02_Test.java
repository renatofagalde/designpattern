package br.com.likwi.designPattern.comportamentais.templateMethod;

import br.com.likwi.designPattern.Setup;
import br.com.likwi.designPattern.comportamentais.templateMethod.step02.Gateway;
import br.com.likwi.designPattern.comportamentais.templateMethod.step02.PagamentoCredito;
import br.com.likwi.designPattern.comportamentais.templateMethod.step02.PagamentoDebito;
import br.com.likwi.designPattern.comportamentais.templateMethod.step02.PagamentoDinheiro;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PagamentoStep02_Test extends Setup {

    private static Gateway GATEWAY;
    private static double VALOR = 1000;

    @BeforeAll
    public static void inicializar_dependencias() {
        GATEWAY = new Gateway();
    }

    @Test
    public void realizar_descontos() {
        final PagamentoCredito pagamentoCredito = PagamentoCredito.builder()
                .gateway(GATEWAY)
                .valor(VALOR)
                .build();
        pagamentoCredito.realizarCobranca();

        final PagamentoDebito pagamentoDebito = PagamentoDebito.builder()
                .gateway(GATEWAY)
                .valor(VALOR)
                .build();
        pagamentoDebito.realizarCobranca();

        final PagamentoDinheiro pagamentoDinheiro = PagamentoDinheiro.builder()
                .gateway(GATEWAY)
                .valor(VALOR)
                .build();
        pagamentoDinheiro.realizarCobranca();

        logger.info("Credito " + pagamentoCredito.getValorFinal());
        logger.info("Debito " + pagamentoDebito.getValorFinal());
        logger.info("Dinheiro " + pagamentoDinheiro.getValorFinal());

        //credito mais caro 1030.0
        assertThat(VALOR).as("Valor final cartão de crédito ", VALOR).isLessThan(pagamentoCredito.getValorFinal());

        //debito 954
        assertThat(VALOR).as("Valor final cartão de debito ", VALOR).isGreaterThan(pagamentoDebito.getValorFinal());

        //dinheiro
        assertThat(VALOR).as("Valor final cartão de dinheiro ", VALOR).isGreaterThan(pagamentoDinheiro.getValorFinal());
    }
}
