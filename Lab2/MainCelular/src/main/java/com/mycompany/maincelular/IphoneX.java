
package com.mycompany.maincelular;

/**
 *
 * @author leona
 */
public class IphoneX implements Celular{

     @Override
    public void fazLigacao() {
        System.out.println("IphoneX ligou para o contato");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IphoneX Tik, Tik, olha a foto ");
    }
    
}
