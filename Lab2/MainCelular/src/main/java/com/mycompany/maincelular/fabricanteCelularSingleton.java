
package com.mycompany.maincelular;

public class fabricanteCelularSingleton {
    
    private static Samsung samsung;
    
    private  static Apple apple;
    
    public static fabricanteCelular getInstance(String fabricante){       
         if(fabricante.equals("apple")){
             if(apple == null){
                 apple = new Apple();
             }
             return apple;
         }
         
         else{
             if(samsung == null){
                 samsung = new Samsung();
             }
             return samsung;
         }
       
    
    }


}
