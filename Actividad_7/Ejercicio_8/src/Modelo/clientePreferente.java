package Modelo;

import Modelo. *;

public class clientePreferente extends Cliente{

    private int NumeroFondos;
    private Fondo fondo;

    public clientePreferente() {
        super();
        this.NumeroFondos = 0;
        this.fondo = new Fondo();
    }



    public clientePreferente(int NumeroFondos, String NIF, String Nombre, String Apellido, int NumeroCuenta, int Saldo) {
        super(NIF, Nombre, Apellido, NumeroCuenta, Saldo);
        this.NumeroFondos = NumeroFondos;
    
    }

    public clientePreferente(String NIF, String Nombre, String Apellido, int NumeroCuenta, int Saldo) {
        super(NIF, Nombre, Apellido, NumeroCuenta, Saldo);
    
    
    }

    public int getNumeroFondos() {
        return NumeroFondos;
    }

    public Fondo getFondo() {
        return fondo;
    }

    public void setNumeroFondos(int NumeroFondos) {
        this.NumeroFondos = NumeroFondos;
    }

    public void setFondo(Fondo fondo) {
        this.fondo = fondo;
    }


    
    

    @Override
    public String toString() {
        return  super.toString() ;
    }
    public String toString1() {
        return  super.toString() +
                "\nnumFondos:" + NumeroFondos;
    }
   
    
}