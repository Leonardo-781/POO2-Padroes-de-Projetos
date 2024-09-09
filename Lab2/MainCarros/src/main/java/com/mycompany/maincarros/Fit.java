
package com.mycompany.maincarros;

public class Fit implements IVehicle{
    @Override
    public void start() {
        System.out.println("O carro Fit ligou");
    }

    @Override
    public void drive() {
        System.out.println("O carro Fit está rodando");
    }

    @Override
    public void stop() {
        System.out.println("O carro Fit parou");
    }
}
