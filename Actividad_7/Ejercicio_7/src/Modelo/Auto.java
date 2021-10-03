
package Modelo;

import Modelo.Vehiculo;


    public abstract class Auto extends Vehiculo {

    public int pasajeros;


    public Auto(int NumeroDeSerieMotor, int Año, String Marca, double precio,int pasajeros) {
        super(NumeroDeSerieMotor, Año, Marca, precio);
        this.pasajeros = pasajeros;
    }

}
    
