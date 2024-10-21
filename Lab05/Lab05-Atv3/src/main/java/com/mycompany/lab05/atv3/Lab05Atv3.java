/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab05.atv3;

/**
 *
 * @author leona
 */
public class Lab05Atv3 {

    public static void main(String[] args) {
        Imagem imagem = new ImagemProxy("foto_perfil_usuario.jpg");
        // Carrega apenas quando for realmente necessário
        imagem.exibir();
    }
}
