package br.com.likwi.designPattern.comportamentais.state.step02;

public class EnviadoState implements IPedidoState {

    private Pedido pedido;

    public EnviadoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        throw new UnsupportedOperationException("Operação não suportada, o pedido já foi pago e enviado");
    }

    @Override
    public void despachar() {
        throw new UnsupportedOperationException("Operação não suportada, o pedido já foi pago e enviado");
    }

    @Override
    public void cancelar() {
        throw new UnsupportedOperationException("Operação não suportada, o pedido já foi pago e enviado");
    }
}
