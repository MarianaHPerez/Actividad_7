/*

Diseñe una jerarquía para las clases Cuadrilátero, Trapecio, Rectángulo y Cuadrado. Use la clase Cuadrilátero como
la clase base de la jerarquía. Los datos privados de la clase base deben ser las coordenadas x-y de los cuatro vértices
de la figura y debe contener un método para calcular el área. Agregue un constructor a cada clase para inicializar sus
datos e invoque el constructor de la clase base desde el constructor de cada clase derivada. Escriba un programa que
instancie objetos de cada una de las clases y calcule el área correspondiente. Investigue las fórmulas.


 */
package Modelo;


public class Cuadrilatero {
    
  private double x;
  private double y;

  
    public Cuadrilatero() {
      }


    public Cuadrilatero(double x, double y) {
        this.x = x;
        this.y = y;
      }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

   
    
    public double CalcularArea (){
          return 0;
    }
}
    