/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06.atv01;

/**
 *
 * @author leona
 */
public class PrefeituraUberlandia implements Observer {
    @Override
    public void update(float umidade) {
        System.out.println("Prefeitura de Uberlândia recebeu atualização de umidade: " + umidade + "%");
    }
}
