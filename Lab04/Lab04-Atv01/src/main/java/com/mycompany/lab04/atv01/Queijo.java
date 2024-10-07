/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04.atv01;

/**
 *
 * @author leona
 */
public class Queijo extends ToppingDecorator {

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 5.00;  
    }
}