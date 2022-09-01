package br.com.likwi.designPattern.comportamentais.state.step01;

import lombok.Builder;
import lombok.Getter;

import java.util.logging.Level;
import java.util.logging.Logger;

@Getter
public class Pedido {
//    private static int AGUARDANDO_PAGAMENTO = 1;
//    private static int PAGO = 2;
//    private static int CANCELADO = 3;
//    private static int ENVIADO = 4;

    public static Logger logger = Logger.getLogger(Pedido.class.toString());

    private PedidoEstadoEnum estadoAtual;

    @Builder
    public Pedido() {
//        this.estadoAtual = Enum.valueOf(PedidoEstadoEnum.class, "AGUARDANDO_PAGAMENTO");
        this.estadoAtual = PedidoEstadoEnum.AGUARDANDO_PAGAMENTO;
        logger.info("Estado atual -> " + estadoAtual);
    }

    public Pedido sucessoAoPagar() {
        if (this.estadoAtual == PedidoEstadoEnum.AGUARDANDO_PAGAMENTO) {
            this.estadoAtual = PedidoEstadoEnum.PAGO;
            logger.info("Estado atual -> " + estadoAtual);
        } else {
            logger.log(Level.WARNING, "Pedido não está aguardando pagamento!");
        }

        return this;
    }

    public Pedido cancelarPedido() {
        if (this.estadoAtual == PedidoEstadoEnum.AGUARDANDO_PAGAMENTO ||
                this.estadoAtual == PedidoEstadoEnum.PAGO) {
            this.estadoAtual = PedidoEstadoEnum.CANCELADO;
            logger.info("Estado atual -> " + estadoAtual);
        } else {
            logger.log(Level.WARNING, "Pedido não pode ser cancelado!");
        }

        return this;
    }

    public Pedido despachar() {
        if (this.estadoAtual == PedidoEstadoEnum.PAGO) {
            this.estadoAtual = PedidoEstadoEnum.Enviado;
            logger.info("Estado atual -> " + estadoAtual);
        } else {
            logger.log(Level.WARNING, "O pedido não pode ser enviado!");
        }
        return this;
    }

    //PedidoEstadoEnum tc = Enum.valueOf (PedidoEstadoEnum.class, "AGUARDANDO_PAGAMENTO");
    public static enum PedidoEstadoEnum {
        AGUARDANDO_PAGAMENTO(1),
        PAGO(2),
        CANCELADO(3),
        Enviado(4);

        private int estado;

        private PedidoEstadoEnum(int estado) {
            this.estado = estado;
        }

        public int getEstado() {
            return estado;
        }
    }
}
