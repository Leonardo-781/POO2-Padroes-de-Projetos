/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05.atv3;

/**
 *
 * @author leona
 */
public class ImagemReal implements Imagem {
    private String caminhoArquivo;

    public ImagemReal(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
        carregarImagem();
    }

    private void carregarImagem() {
        System.out.println("Carregando imagem de " + caminhoArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem completa de " + caminhoArquivo);
    }
}
