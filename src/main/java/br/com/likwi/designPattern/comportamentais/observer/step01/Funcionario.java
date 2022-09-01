package br.com.likwi.designPattern.comportamentais.observer.step01;


import lombok.Builder;
import lombok.Getter;

@Getter
public class Funcionario extends Skull {

    @Builder
    public Funcionario(String nome, String email, Subject subject) {
        super(nome, email, subject);
        this.subject.subscribeObserver(this);
    }

    //os outros getNome e getEmail já estão
    //sendo sobrescritos por conta do @getter
    @Override
    public void update(String mensagem) {
        Email.enviarEmail(this, mensagem);
    }
}
