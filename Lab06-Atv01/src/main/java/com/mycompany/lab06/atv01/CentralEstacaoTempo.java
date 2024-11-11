/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06.atv01;

/**
 *
 * @author leona
 */
import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo {
    private List<Observer> observers;
    private float umidade;
    private float velocidadeRajadas;

    public CentralEstacaoTempo() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
        notifyObserversUmidade();
    }

    public void setVelocidadeRajadas(float velocidadeRajadas) {
        this.velocidadeRajadas = velocidadeRajadas;
        notifyObserversRajadas();
    }

    private void notifyObserversUmidade() {
        for (Observer observer : observers) {
            if (observer instanceof PrefeituraUberlandia) {
                observer.update(umidade);
            }
        }
    }

    private void notifyObserversRajadas() {
        for (Observer observer : observers) {
            if (observer instanceof AeroportoUberlandia) {
                observer.update(velocidadeRajadas);
            }
        }
    }
}
