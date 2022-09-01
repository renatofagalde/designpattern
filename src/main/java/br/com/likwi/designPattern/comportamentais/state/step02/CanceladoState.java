package br.com.likwi.designPattern.comportamentais.state.step02;

public class CanceladoState implements IPedidoState{

    private Pedido pedido;

    public CanceladoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        throw new UnsupportedOperationException("Operação não suportada, o pedido se encontra cancelado");
    }

    @Override
    public void despachar() {
        throw new UnsupportedOperationException("Operação não suportada, o pedido se encontra cancelado");
    }

    @Override
    public void cancelar() {
        throw new UnsupportedOperationException("Operação não suportada, o pedido se encontra cancelado");
    }
}
