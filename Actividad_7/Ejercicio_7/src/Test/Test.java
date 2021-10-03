package Test;

import Modelo.Vehiculo;
import Modelo.Vagoneta;
import Modelo.Camioneta;
import Modelo.AutoLujo;
import Modelo.AutoCompacto;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Vehiculo vehiculos[] = new Vehiculo[4];

        int NumeroDeSerieMotor = 0;
        int Año = 0;
        int NumPasajeros = 0;
        int Carga = 0;
        int Ejes = 0;
        int Rodadas = 0;
        double Precio = 0;
        String Marca = "";

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n********************************************************  " + "\n");
        System.out.println("\n******* Auto Compacto *******" + "\n");
        
        System.out.println("Por favor , Introduzca el numero de serie del motor: ");
        NumeroDeSerieMotor = sc.nextInt();
        System.out.println("Por favor , Introduzca la marca: ");
        Marca = sc.next();
        System.out.println("Por favor , Introduzca el año: ");
        Año = sc.nextInt();
        System.out.println("Por favor , Introduzca el precio: ");
        Precio = sc.nextDouble();
        System.out.println("Por favor , Introduzca la cantidad de pasajeros: ");
        NumPasajeros = sc.nextInt();

        vehiculos[0] = new AutoCompacto(NumeroDeSerieMotor, Año, Marca, Precio, NumPasajeros);
        System.out.println(vehiculos[0].toString());
        
        
        System.out.println("\n********************************************************  " + "\n");
        System.out.println("\n******* Camioneta ******* " + "\n");
        
        System.out.println("Por favor , Introduzca el numero de serie del motor: ");
        NumeroDeSerieMotor = sc.nextInt();
        System.out.println("Por favor , Introduzca la marca: ");
        Marca = sc.next();
        System.out.println("Por favor , Introduzca el año: ");
        Año = sc.nextInt();
        System.out.println("Por favor , Introduzca el precio: ");
        Precio = sc.nextDouble();
        System.out.println("Por favor , Introduzca la cantidad de carga: ");
        Carga = sc.nextInt();
        System.out.println("Por favor , Introduzca la cantidad de ejes: ");
        Ejes = sc.nextInt();
        System.out.println("Por favor , Introduzca la cantidad de rodadas: ");
        Rodadas = sc.nextInt();
        vehiculos[1] = new Camioneta(NumeroDeSerieMotor, Año, Marca, Precio, Carga, Ejes, Rodadas);
        System.out.println(vehiculos[1].toString());
        
        
        System.out.println("\n********************************************************  " + "\n");
        System.out.println("\n******* Auto de Lujo *******" + "\n");
        
        System.out.println("Por favor , Introduzca el numero de serie del motor: ");
        NumeroDeSerieMotor = sc.nextInt();
        System.out.println("Por favor , Introduzca la marca: ");
        Marca = sc.next();
        System.out.println("Por favor , Introduzca el año: ");
        Año = sc.nextInt();
        System.out.println("Por favor , Introduzca el precio: ");
        Precio = sc.nextDouble();
        System.out.println("Por favor , Introduzca la cantidad de pasajeros: ");
        NumPasajeros = sc.nextInt();
        vehiculos[0] = new AutoLujo(NumeroDeSerieMotor, Año, Marca, Precio, NumPasajeros);
        System.out.println(vehiculos[0].toString());
 
        
        System.out.println("\n********************************************************  " + "\n");
        System.out.println("\n******* Vagoneta *******  " + "\n");
        
        System.out.println("Por favor , Introduzca el numero de serie del motor: ");
        NumeroDeSerieMotor = sc.nextInt();
        System.out.println("Por favor , Introduzca la marca: ");
        Marca = sc.next();
        System.out.println("Por favor , Introduzca el año: ");
        Año = sc.nextInt();
        System.out.println("Por favor , Introduzca el precio: ");
        Precio = sc.nextDouble();
        System.out.println("Por favor , Introduzca la cantidad de pasajeros: ");
        NumPasajeros = sc.nextInt();
        vehiculos[0] = new Vagoneta(NumeroDeSerieMotor, Año, Marca, Precio, NumPasajeros);
        System.out.println(vehiculos[0].toString());

    }

}
