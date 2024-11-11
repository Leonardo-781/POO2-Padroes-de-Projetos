package com.mycompany.lab06.atv02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leona
 */
import java.util.ArrayList;
import java.util.List;

public class Acao {
    private List<Investor> investors;
    private float price;

    public Acao(float initialPrice) {
        this.investors = new ArrayList<>();
        this.price = initialPrice;
    }

    public void addObserver(Investor investor) {
        investors.add(investor);
    }

    public void removeObserver(Investor investor) {
        investors.remove(investor);
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Investor investor : investors) {
            investor.update(price);
        }
    }
}
