package Modelo;

import Modelo.Auto;


public class AutoCompacto extends Auto {

    public AutoCompacto(int NumeroDeSerieMotor, int Año, String Marca, double precio, int pasajeros) {
        super(NumeroDeSerieMotor, Año, Marca, precio, pasajeros);
    }


    @Override
    public String toString() {
        return "Auto_Compacto [Pasajeros=" + pasajeros + ", Numero de Serie del Motor=" + NumeroDeSerieMotor + ", Año=" + Año
                + ", Marca=" + Marca + ", Precio=" + Precio + "]";
    }

}

