package br.com.likwi.designPattern.comportamentais.state.step02;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.logging.Logger;

@Getter
public class Pedido {

    public static Logger logger = Logger.getLogger(Pedido.class.toString());

    private IPedidoState aguardandoPagamento;
    private IPedidoState pago;
    private IPedidoState cancelado;
    private IPedidoState enviado;

    @Setter
    private IPedidoState estadoAtual;


    @Builder
    public Pedido() {
        //todo
        this.aguardandoPagamento = new AguardandoPagamentoState(this);
        this.pago = new PagoState(this);
        this.cancelado = new CanceladoState(this);
        this.enviado = new EnviadoState(this);
        this.estadoAtual = this.aguardandoPagamento;
        logger.info("Estado atual -> " + estadoAtual);
    }

    public Pedido realizarPagamento() {
        this.estadoAtual.sucessoAoPagar();
        return this;
    }

    public Pedido cancelarPedido() {
        this.estadoAtual.cancelar();
        return this;
    }

    public Pedido despachar() {
        this.estadoAtual.despachar();
        return this;
    }
}
