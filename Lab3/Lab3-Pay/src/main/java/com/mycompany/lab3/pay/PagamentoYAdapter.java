/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3.pay;

/**
 *
 * @author leona
 */

public class PagamentoYAdapter implements ProcessadorPagamento {
    private final PagamentoY pagamentoY;

    public PagamentoYAdapter(PagamentoY pagamentoY) {
        this.pagamentoY = pagamentoY;
    }

    @Override
    public void processarPagamento(double valor) {
        pagamentoY.executarTransacao(valor);
    }

    @Override
    public String obterStatus() {
        return pagamentoY.verificarStatusTransacao();
    }
}
