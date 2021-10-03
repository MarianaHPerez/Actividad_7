package Modelo;

public abstract class Vehiculo {

    public int NumeroDeSerieMotor;
    public int Año;
    public String Marca;
    public double Precio;

    public Vehiculo(int NumeroDeSerieMotor, int Año, String Marca, double precio) {
        super ();
        this.NumeroDeSerieMotor = NumeroDeSerieMotor;
        this.Año = Año;
        this.Marca = Marca;
        this.Precio = Precio;
    }



}


