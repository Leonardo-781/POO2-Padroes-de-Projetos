/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04.atv02;

/**
 *
 * @author leona
 */
public class Leite extends AdicionalDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Leite";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.50; 
    }
}
