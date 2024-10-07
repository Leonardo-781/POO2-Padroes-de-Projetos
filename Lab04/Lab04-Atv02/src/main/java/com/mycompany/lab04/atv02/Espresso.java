/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04.atv02;

/**
 *
 * @author leona
 */
public class Espresso implements Bebida {

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double calculaCusto() {
        return 5.00;  
    }
}
