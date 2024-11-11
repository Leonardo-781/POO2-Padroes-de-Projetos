package com.mycompany.lab06.atv02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leona
 */
public class SpecificInvestor implements Investor {
    private float minPrice;
    private float maxPrice;

    public SpecificInvestor(float minPrice, float maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public void update(float price) {
        if (price <= minPrice) {
            System.out.println("Preço atingiu o mínimo. Acionando venda.");
        } else if (price >= maxPrice) {
            System.out.println("Preço atingiu o máximo. Acionando venda.");
        } else {
            System.out.println("Preço atual: " + price);
        }
    }
}
