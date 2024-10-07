/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04.atv02;

/**
 *
 * @author leona
 */
public abstract class AdicionalDecorator implements Bebida {
    protected Bebida bebida;  

    public AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto();
    }
}
