/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04.atv01;

/**
 *
 * @author leona
 */
public class MassaEspessaPizza implements Pizza {

    @Override
    public String getDescricao() {
        return "Pizza com massa espessa";
    }

    @Override
    public double getCusto() {
        return 18.00;  
    }
}