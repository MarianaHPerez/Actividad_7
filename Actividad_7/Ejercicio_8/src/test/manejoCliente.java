package test;

import Modelo.*;
import java.util.Scanner;

public class manejoCliente {
    public static void main(String[] args){
        
        
        String [] nombres= {"Rechael","Harry","James","David","Dande","Jimim","Sugga","Lissa","Yuna","Marcus"};
        String [] apellidos = {"Potter","Andros","Jackson","Curvin","Russou","Copper","Mendes","Alba","Evans","Malfoy"};
        String nif,numero;
        Scanner sc = new Scanner (System.in); 
        
        int numCliente=0,saldo,numfondos,numFondos,numCuenta;
        double saldoMensual;
        
         System.out.println(" __________________ CLIENTE ________________");
         
            do{
                numCliente=(int)(Math.random()*10);
            }while(numCliente<1);
        
        
        Cliente []miCliente = new Cliente[numCliente];
        for (int i = 0; i < numCliente; i++) {
            Fondo miFondo = new Fondo();
            nif = String.valueOf((int)(Math.random()*10000)); 
            numCuenta=(int)(Math.random()*10);
            do{
               saldo=(int)(Math.random()*1000); 
            }while(saldo<100);
            miCliente[i] = new Cliente(nif,nombres[(int)(Math.random()*10)],apellidos[(int)(Math.random()*10)],numCuenta,saldo);
        }
        for (int i = 0; i < numCliente; i++) {
            System.out.print("\nC. N°: "+(i+1)+"\n"+miCliente[i].toString());   
        }
        
        clientePreferente []miPreferente = new clientePreferente[numCliente];
        
        
        System.out.println("\n __________________ CLIENTE PREFERENTE __________________");
        
              
              do{
                numCliente=(int)(Math.random()*10);
            }while(numCliente<1); 
               
        
        for (int i = 0; i < numCliente; i++) {
            nif = String.valueOf((int)(Math.random()*10000));
            numCuenta=(int)(Math.random()*10);
            do{
               saldo=(int)(Math.random()*1000); 
            }while(saldo<100);
               
            
                miPreferente[i] = new clientePreferente(nif,nombres[(int)(Math.random()*10)],apellidos[(int)(Math.random()*10)],numCuenta,saldo);
                System.out.println("\nC.P. N°: "+(i+1)+"\n"+miPreferente[i].toString());
                Fondo miFondo = new Fondo();
                System.out.print(" Por favor, Ingrese el numero de FONDOS: ");
                do{
                    numfondos=sc.nextInt();
                }while(numfondos<1);
                for (int j = 0; j < numfondos; j++) {
                    System.out.println("_________INGRESANDO FONDO N°: "+(j+1)+"_________");
                    System.out.print(" Por favor, Ingrese el numero de FONDO: ");
                    numero=String.valueOf(sc.next());
                    System.out.print(" Por favor, Ingrese el SALDO MENSUAL: ");
                    do{
                        saldoMensual=sc.nextDouble();
                    }while(saldoMensual<1);
                    miFondo.setNum(numero);
                    miFondo.setSaldoMen(saldoMensual);
                    System.out.println( miFondo.toString());
                }
               
            } 
        }
        
}
