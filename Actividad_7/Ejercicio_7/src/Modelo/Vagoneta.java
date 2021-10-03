package Modelo;

import Modelo.Auto;

public class Vagoneta extends Auto {

    public Vagoneta(int NumeroDeSerieMotor, int Año, String Marca, double precio, int pasajeros) {
        super(NumeroDeSerieMotor, Año, Marca, precio, pasajeros);
    }



    @Override
    public String toString() {
        return "Vagoneta_ [Pasajeros=" + pasajeros + ", Numer de Serie del Motor=" + NumeroDeSerieMotor + ", Año=" + Año
                + ", Marca=" + Marca + ", Precio=" + Precio + "]";
    }

}


