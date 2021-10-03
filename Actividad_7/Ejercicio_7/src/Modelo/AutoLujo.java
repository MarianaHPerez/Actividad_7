package Modelo;

import Modelo.Auto;

public class AutoLujo extends Auto {

    public AutoLujo(int NumeroDeSerieMotor, int Año, String Marca, double precio, int pasajeros) {
        super(NumeroDeSerieMotor, Año, Marca, precio, pasajeros);
    }



    @Override
    public String toString() {
        return "Auto_Lujo [Pasajeros=" + pasajeros + ", Numero de Serie del Motor=" + NumeroDeSerieMotor + ", Año=" + Año
                + ", Marca=" + Marca + ", Precio=" + Precio + "]";
    }

}
