package br.com.likwi.designPattern.comportamentais.observer.step01;

public interface Subject {
    void subscribeObserver(Observer observer);
    void unsubscribeObserver(Observer observer);
    void notifyObservers();
}
