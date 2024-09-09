

package com.mycompany.maincarros;

public class MainCarros {

    public static void main(String[] args) {
     
        IVhecleMakerSingleton singleton = new IVhecleMakerSingleton();
        IVehicleMaker fabricanteHonda = singleton.getInstance("Honda");
        
        IVehicle city = fabricanteHonda.makeVehicle("City");
        city.start();
        city.drive();
        city.stop();
        
        
        IVehicle civic = fabricanteHonda.makeVehicle("Civic");
        civic.start();
        civic.drive();
        civic.stop();
        
        IVehicle fit = fabricanteHonda.makeVehicle("Fit");
        fit.start();
        fit.drive();
        fit.stop();
        
        
        
        IVehicleMaker fabricanteToyota = singleton.getInstance("Toyota");
        
        IVehicle corolla = fabricanteToyota.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();
        
        
        IVehicle hilux = fabricanteToyota.makeVehicle("Hilux");
        hilux.start();
        hilux.drive();
        hilux.stop();
        
        IVehicle etios = fabricanteToyota.makeVehicle("Etios");
        etios.start();
        etios.drive();
        etios.stop();
        
    }
}
