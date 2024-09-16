/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3.aves;

/**
 *
 * @author leona
 */
class PatoDomestico implements Aves {
    @Override
    public void voar() {
        System.out.println("O pato doméstico voa baixinho.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pato doméstico faz quack quack!");
    }
}