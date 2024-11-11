/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab06.atv02;

/**
 *
 * @author leona
 */

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao(100.0f);

        SpecificInvestor investor1 = new SpecificInvestor(80.0f, 120.0f);
        acao.addObserver(investor1);

        acao.setPrice(75.0f);  
        acao.setPrice(130.0f); 
    }
}
