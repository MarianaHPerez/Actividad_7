
package test;


import  Modelo. * ;

public class Test {
    

    public static void main(String[] args) {
        
        Trapecio F1 = new Trapecio( 5.1,  3,  10, 1.0, 4.6 );
        System.out.println("El Area del Trapecio es = "+ F1.CalcularArea());
        
        Rectangulo F2 = new Rectangulo( 4.7,  10.5 , 6, 8 );
        System.out.println("El Area del Rectangulo es = "+ F2.CalcularArea());
        
        Cuadrado F3 = new Cuadrado( 9.2,  10.7,  6 );
        System.out.println("El Area del Cuadrado es = "+ F3.CalcularArea());
           
       
    }  
    
}
