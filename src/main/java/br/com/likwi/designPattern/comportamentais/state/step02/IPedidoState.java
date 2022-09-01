package br.com.likwi.designPattern.comportamentais.state.step02;

public interface IPedidoState {
    void sucessoAoPagar();
    void despachar();
    void cancelar();
}
