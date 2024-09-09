
package com.mycompany.maincarros;

public class Hilux implements IVehicle{
    @Override
    public void start() {
        System.out.println("O carro Tombalux ligou");
    }

    @Override
    public void drive() {
        System.out.println("O carro Tombalux está rodando");
    }

    @Override
    public void stop() {
        System.out.println("O carro Tombalux parou");
    }
}
