/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author leona
 */

  public class Main {
    public static void main(String[] args) {
        // Instancia a calculadora binária existente
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        // Usa o Adapter para criar uma calculadora que trabalha com números decimais
        Calculadora calculadora = new CalculadoraAdapter(calculadoraBinaria);

        // Testa operações com números decimais
        int num1 = 10; // 10 em decimal é 1010 em binário
        int num2 = 5;  // 5 em decimal é 101 em binário

        System.out.println("Operações com números decimais:");

        int resultadoSoma = calculadora.somar(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultadoSoma);

        int resultadoSubtracao = calculadora.subtrair(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicar(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultadoMultiplicacao);
    }
}
