package br.com.likwi.designPattern.comportamentais.state.step02;

public class PagoState implements IPedidoState {

    private Pedido pedido;

    public PagoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        throw new UnsupportedOperationException("Operação não suportada, o pedido já foi pago");
    }

    @Override
    public void despachar() {
        //recuperando o atributo da classe
        this.pedido.setEstadoAtual(pedido.getEnviado());
    }

    @Override
    public void cancelar() {
        //recuperando o atributo da classe
        this.pedido.setEstadoAtual(this.pedido.getCancelado());
    }
}
