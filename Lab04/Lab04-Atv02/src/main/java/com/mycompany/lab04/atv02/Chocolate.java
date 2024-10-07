/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04.atv02;

/**
 *
 * @author leona
 */
public class Chocolate extends AdicionalDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 2.00;  
    }
}
