package br.com.likwi.designPattern.comportamentais.observer.step01;

import lombok.Getter;

@Getter
public abstract class Skull implements Observer{

    protected String nome;
    protected String email;
    protected Subject subject;

    public Skull(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
    }
}
