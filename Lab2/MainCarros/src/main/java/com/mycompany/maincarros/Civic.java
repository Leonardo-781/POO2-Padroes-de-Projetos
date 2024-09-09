
package com.mycompany.maincarros;


public class Civic implements IVehicle{
    @Override
    public void start() {
        System.out.println("O carro Civic ligou");
    }

    @Override
    public void drive() {
        System.out.println("O carro Civic está rodando");
    }

    @Override
    public void stop() {
        System.out.println("O carro Civic parou");
    }
}
