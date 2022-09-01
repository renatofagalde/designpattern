package br.com.likwi.designPattern.comportamentais.state;

import br.com.likwi.designPattern.comportamentais.state.step01.Pedido;
import org.junit.jupiter.api.Test;

public class PedidoStep01_Test {

    @Test
    public void exibir_estado_inicial_do_pedido(){
        new Pedido();
    }

    @Test
    public void trocando_estado_para_pago(){
        new Pedido().sucessoAoPagar();
    }
    @Test
    public void cancelar_pedido_ao_criar(){
        new Pedido().cancelarPedido();
    }

    @Test
    public void cancelar_pedido_apos_ser_pago(){
        new Pedido()
                .sucessoAoPagar()
                .cancelarPedido();
    }

    @Test
    public void cancelar_pedido_apos_ser_despachado(){
        new Pedido()
                .sucessoAoPagar()
                .despachar()
                .cancelarPedido();
    }

    @Test
    public void despachar_pedido_sem_troca_de_estado(){
        new Pedido()
                .despachar();
    }

    @Test
    public void nao_conseguir_despachar_pedido_pago_e_cancelado(){
        new Pedido()
                .sucessoAoPagar()
                .cancelarPedido()
                .despachar();
    }

}
