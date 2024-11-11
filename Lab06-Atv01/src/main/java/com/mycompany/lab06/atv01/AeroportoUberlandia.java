/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06.atv01;

/**
 *
 * @author leona
 */
public class AeroportoUberlandia implements Observer {
    @Override
    public void update(float velocidadeRajadas) {
        System.out.println("Aeroporto de Uberlândia recebeu atualização de rajadas de vento: " + velocidadeRajadas + " km/h");
    }
}
