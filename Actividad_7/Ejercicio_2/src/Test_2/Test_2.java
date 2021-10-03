
package Test_2;
import  Modelo. * ;

/**
 *
 * @author WINDOWS10
 */
public class Test_2 {
    
    public static void main(String[] args){
           
        Empleado Emp1 = new Empleado("Kevin");
        Directivo D1 = new Directivo("Andres");
        Operario Op1 = new Operario("Alejandra");
        Oficial OF1 = new Oficial("Madona");
        Tecnico T1 = new Tecnico("Sugga");
        
        
        System.out.println(Emp1.ToString());
        System.out.println(D1.ToString());
        System.out.println(Op1.ToString());
        System.out.println(OF1.ToString());
        System.out.println(T1.ToString());
     }
}
