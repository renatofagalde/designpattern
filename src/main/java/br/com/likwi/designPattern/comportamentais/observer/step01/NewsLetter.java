package br.com.likwi.designPattern.comportamentais.observer.step01;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject {

    private List<Observer> observers;
    private List<String> mensagens;

    public NewsLetter() {
        instancirarObjtos();
    }

    public NewsLetter(List<Observer> observers, List<String> mensagens) {
        instancirarObjtos();
        this.observers = observers;
        this.mensagens = mensagens;
    }

    private void instancirarObjtos() {
        this.observers = new ArrayList<Observer>();
        this.mensagens = new ArrayList<String>();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(object -> object.update(this.mensagens.get(this.mensagens.size() - 1)));
    }

    public void addMensagem(String mensagem) {
        this.mensagens.add(mensagem);
        this.notifyObservers();
    }
}
