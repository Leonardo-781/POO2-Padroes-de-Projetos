/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3.pay;

/**
 *
 * @author leona
 */

public class PagamentoX implements ProcessadorPagamento {
    private String status;

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PagamentoX...");
        this.status = "PagamentoX: Pagamento realizado com sucesso";
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
