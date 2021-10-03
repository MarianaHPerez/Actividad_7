package Modelo;

import Modelo.Vehiculo;

public class Camioneta extends Vehiculo {

    public int Capacidad_C;
    public int Cantidad_E;
    public int Cantidad_R;

    public Camioneta(int NumeroDeSerieMotor, int Año, String Marca, double precio,int Capacidad_C, int Cantidad_E, int Cantidad_R) {
        super(NumeroDeSerieMotor, Año, Marca, precio);
        this.Capacidad_C = Capacidad_C;
        this.Cantidad_E = Cantidad_E;
        this.Cantidad_R = Cantidad_R;
    }


    @Override
    public String toString() {
        return "Camioneta_ [CapacidadCarga=" + Capacidad_C + ", CantidadEjes=" + Cantidad_E
                + ", Cantidad de Rodadas=" + Cantidad_R + ", Numero de Serie del Motor=" + NumeroDeSerieMotor + ", Año=" + Año
                + ", Marca=" + Marca + ", Precio=" + Precio + "]";
    }

}
