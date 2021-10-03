package Modelo;

public class Cliente {
    
    private String Nombre;
    private String Apellido;
    private String NIF;
    private int NumeroCuenta;
    private int Saldo;
    //protected Fondo fondo;

    public Cliente() {
        this.NIF = "";
        this.NumeroCuenta = 0;
        this.Saldo = 0;
    }

    public Cliente(String NIF, String Nombre, String Apellido, int NumeroCuenta, int Saldo) {
        this.NIF = NIF;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
    }
    
    public Cliente(String NIF, int NumeroCuenta, int Saldo) {
        this.NIF = NIF;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

  

    
    public String toString() {
        return  "NIF: " + NIF + "  NOMBRE: " + Nombre + "  APELLIDO: " + Apellido +
                "\nnumCuenta: " + NumeroCuenta + ", saldo: " + Saldo ;
    }
    
}

