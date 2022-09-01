package br.com.likwi.designPattern.comportamentais.state.step02;

public class AguardandoPagamentoState implements IPedidoState{

    private Pedido pedido;

    public AguardandoPagamentoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        //recuperando o atributo da classe
        this.pedido.setEstadoAtual(this.pedido.getPago());
    }

    @Override
    public void despachar() {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    @Override
    public void cancelar() {
        //recuperando o atributo da classe
        this.pedido.setEstadoAtual(this.pedido.getCancelado());

    }
}
