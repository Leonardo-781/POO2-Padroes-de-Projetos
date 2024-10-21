/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05.atv2;

/**
 *
 * @author leona
 */
public class CarroFacade {
    private Motor motor;
    private CintoSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFacade() {
        this.motor = new Motor();
        this.cinto = new CintoSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void iniciarCorrida() {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar("88.7 FM");
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
