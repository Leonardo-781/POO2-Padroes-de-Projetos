/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab04.atv01;

/**
 *
 * @author leona
 */
public class Lab04Atv01 {

    public static void main(String[] args) {
     
        Pizza pizzaMarguerita = new MassaFinaPizza();
        pizzaMarguerita = new Queijo(pizzaMarguerita);
        pizzaMarguerita = new Tomate(pizzaMarguerita);

        System.out.println("Pedido 1: " + pizzaMarguerita.getDescricao());
        System.out.println("Custo: R$" + pizzaMarguerita.getCusto());

 
        Pizza pizzaPortuguesa = new MassaEspessaPizza();
        pizzaPortuguesa = new Queijo(pizzaPortuguesa);
        pizzaPortuguesa = new Ovo(pizzaPortuguesa);
        pizzaPortuguesa = new Tomate(pizzaPortuguesa);

        System.out.println("\nPedido 2: " + pizzaPortuguesa.getDescricao());
        System.out.println("Custo: R$" + pizzaPortuguesa.getCusto());
    }
}
