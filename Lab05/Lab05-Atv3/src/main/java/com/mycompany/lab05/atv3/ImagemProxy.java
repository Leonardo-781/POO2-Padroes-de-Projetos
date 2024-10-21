/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05.atv3;

/**
 *
 * @author leona
 */
public class ImagemProxy implements Imagem {
    private String caminhoArquivo;
    private ImagemReal imagemReal;

    public ImagemProxy(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(caminhoArquivo);
        }
        System.out.println("Exibindo imagem 'placeholder'.");
        imagemReal.exibir();
    }
}
