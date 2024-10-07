/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab04.atv02;

/**
 *
 * @author leona
 */
 
public class Lab04Atv02 {

    public static void main(String[] args) {
        
        Bebida bebida1 = new Espresso();
        bebida1 = new Leite(bebida1);
        bebida1 = new Canela(bebida1);

        System.out.println("Pedido 1: " + bebida1.getDescricao());
        System.out.println("Custo: R$" + bebida1.calculaCusto());

   
        Bebida bebida2 = new Decaf();
        bebida2 = new Chocolate(bebida2);
        bebida2 = new Leite(bebida2);

        System.out.println("\nPedido 2: " + bebida2.getDescricao());
        System.out.println("Custo: R$" + bebida2.calculaCusto());
    }
}
