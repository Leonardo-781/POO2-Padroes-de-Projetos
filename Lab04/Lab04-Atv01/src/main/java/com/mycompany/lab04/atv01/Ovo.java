/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04.atv01;

/**
 *
 * @author leona
 */
public class Ovo extends ToppingDecorator {

    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Ovo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 4.00;  
    }
}