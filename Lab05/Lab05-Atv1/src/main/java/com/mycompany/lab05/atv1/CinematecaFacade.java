/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05.atv1;

/**
 *
 * @author leona
 */
public class CinematecaFacade {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaPipoca maquinaPipoca;
    private Projetor projetor;
    private PlayerStreaming player;
    private Telao telao;

    public CinematecaFacade() {
        this.amplificador = new Amplificador();
        this.luzes = new Luzes();
        this.maquinaPipoca = new MaquinaPipoca();
        this.projetor = new Projetor();
        this.player = new PlayerStreaming();
        this.telao = new Telao();
    }

    public void assistirFilme(String filme) {
        maquinaPipoca.ligar();
        maquinaPipoca.rebentarPipoca();
        luzes.desligar();
        telao.abaixar();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        player.ligar();
        player.play(filme);
    }

    public void fimDoFilme() {
        System.out.println("Fim do filme, desligando os dispositivos...");
        amplificador.ligar();
        luzes.desligar();
        projetor.ligar();
        telao.abaixar();
        player.ligar();
    }
}
