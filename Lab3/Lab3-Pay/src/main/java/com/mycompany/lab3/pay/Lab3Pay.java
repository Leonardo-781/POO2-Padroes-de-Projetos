/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3.pay;

/**
 *
 * @author leona
 */
public class Lab3Pay {
    public static void main(String[] args) {

        ProcessadorPagamento pagamentoX = new PagamentoX();
        pagamentoX.processarPagamento(100.00);
        System.out.println(pagamentoX.obterStatus());

      
        PagamentoY pagamentoY = new PagamentoY();
        ProcessadorPagamento pagamentoAdaptado = new PagamentoYAdapter(pagamentoY);
        pagamentoAdaptado.processarPagamento(200.00);
        System.out.println(pagamentoAdaptado.obterStatus());
    }
}
