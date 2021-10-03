package Modelo;

public class Fondo {
    private String Num;
    private double SaldoMen;
    
    public Fondo() {
        this.Num = "";
        this.SaldoMen = 0;
    }

    public Fondo(String Num, double SaldoMen) {
        this.Num = Num;
        this.SaldoMen = SaldoMen;
    }

    public String getNum() {
        return Num;
    }

    public double getSaldoMen() {
        return SaldoMen;
    }

    public void setNum(String Num) {
        this.Num = Num;
    }

    public void setSaldoMen(double SaldoMen) {
        this.SaldoMen = SaldoMen;
    }


    @Override
    public String toString() {
        return  "  numero: " + Num + ", saldo Mensual: " + SaldoMen ;
    }
    
}


