
package com.mycompany.maincarros;

public class Corolla implements IVehicle{
    @Override
    public void start() {
        System.out.println("O carro Corola ligou");
    }

    @Override
    public void drive() {
        System.out.println("O carro Corola está rodando");
    }

    @Override
    public void stop() {
        System.out.println("O carro Corola parou");
    }
}
