/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3.pay;

/**
 *
 * @author leona
 */

public class PagamentoY {
    private String statusTransacao;

    public void executarTransacao(double valor) {
        System.out.println("Executando pagamento de R$ " + valor + " via PagamentoY...");
        this.statusTransacao = "PagamentoY: Pagamento realizado com sucesso";
    }

    public String verificarStatusTransacao() {
        return statusTransacao;
    }
}
