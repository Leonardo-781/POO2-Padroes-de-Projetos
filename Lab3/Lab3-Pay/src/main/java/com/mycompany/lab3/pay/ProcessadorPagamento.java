/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab3.pay;

/**
 *
 * @author leona
 */

public interface ProcessadorPagamento {
    void processarPagamento(double valor);
    String obterStatus();
}
