package br.com.likwi.designPattern.comportamentais.state;

import br.com.likwi.designPattern.comportamentais.state.step02.AguardandoPagamentoState;
import br.com.likwi.designPattern.comportamentais.state.step02.EnviadoState;
import br.com.likwi.designPattern.comportamentais.state.step02.PagoState;
import br.com.likwi.designPattern.comportamentais.state.step02.Pedido;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PedidoStep02_Test {


    @Test
    @Order(100)
    @DisplayName(value = "Estado inicial deve ser aguardando pagamento")
    public void estado_inicial_deve_ser_aguardando_pagamento() {

        final Pedido pedido = Pedido.builder().build();


        assertThat(AguardandoPagamentoState.class).as("Estado inicial deve ser aguardando pagamento ")
                .isAssignableFrom(pedido.getEstadoAtual().getClass());
    }

    @Test
    @Order(200)
    @DisplayName(value = "Pedido deve ser pago")
    public void pedido_deve_ser_pago() {

        final Pedido pedido = Pedido.builder().build();
        pedido.realizarPagamento();

        assertThat(PagoState.class).as("Pagando um pedido ")
                .isAssignableFrom(pedido.getEstadoAtual().getClass());
    }

    @Test
    @Order(300)
    @DisplayName(value = "Pedido deve ser enviado apos ser pago")
    public void pedido_deve_ser_pago_e_despachado() {

        final Pedido pedido = Pedido.builder().build();
        pedido.realizarPagamento()
                .despachar();


        assertThat(EnviadoState.class).as("Estado inicial deve ser aguardando pagamento ")
                .isAssignableFrom(pedido.getEstadoAtual().getClass());
    }

    @Test
    @Order(400)
    @DisplayName(value = "Pedido deve gerar excecao ao transacionar direto para enviado")
    public void pedido_deve_gerar_excecao_ao_transacionar_direto_para_enviado() {

        Assertions.assertThatExceptionOfType(UnsupportedOperationException.class)
                .isThrownBy(() -> {
                    final Pedido pedido = Pedido.builder().build();
                    pedido.despachar();

                }).withMessage("Operação não suportada");
    }
}
