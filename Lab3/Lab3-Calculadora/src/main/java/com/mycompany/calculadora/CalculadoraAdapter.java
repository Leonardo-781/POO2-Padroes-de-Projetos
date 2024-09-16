/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author leona
 */



public class CalculadoraAdapter implements Calculadora {
    private final CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    // Converte decimais para binário, pelo menos e o q se espera 
    @Override
    public int somar(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBinario = calculadoraBinaria.somar(binA, binB);
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBinario = calculadoraBinaria.subtrair(binA, binB);
        return Integer.parseInt(resultadoBinario, 2);
    }


    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
