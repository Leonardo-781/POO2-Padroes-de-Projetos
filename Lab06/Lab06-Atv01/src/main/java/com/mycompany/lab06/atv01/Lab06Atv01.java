/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab06.atv01;

public class Main {
    public static void main(String[] args) {
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        cet.addObserver(prefeitura);
        cet.addObserver(aeroporto);

        cet.setUmidade(65.0f);
        cet.setVelocidadeRajadas(25.0f);
    }
}
