/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3.aves;

/**
 *
 * @author leona
 */
public class Main {
    public static void main(String[] args) {

        Aves pato = new Pato();
        Aves patoDomestico = new PatoDomestico();

        Aves pavao = new Pavao();
        Aves pavaoAzul = new PavaoAzul();


        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();

        System.out.println("\nPato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();

        System.out.println("\nPavão:");
        pavao.voar();
        pavao.emitirSom();

        System.out.println("\nPavão Azul:");
        pavaoAzul.voar();
        pavaoAzul.emitirSom();

       
    }
}