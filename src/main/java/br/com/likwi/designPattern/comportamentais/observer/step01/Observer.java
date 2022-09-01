package br.com.likwi.designPattern.comportamentais.observer.step01;

public interface Observer {
    void update(String mensagem);
    String getNome();
    String getEmail();
}
