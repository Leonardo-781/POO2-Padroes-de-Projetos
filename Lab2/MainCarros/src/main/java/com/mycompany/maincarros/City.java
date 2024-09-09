
package com.mycompany.maincarros;


public class City implements IVehicle{

    @Override
    public void start() {
        System.out.println("O carro City ligou");
    }

    @Override
    public void drive() {
        System.out.println("O carro City está rodando");
    }

    @Override
    public void stop() {
        System.out.println("O carro City parou");
    }
    
}
