
package Modelo;

/**
 *
 * @author WINDOWS10
 */
public class Directivo extends Empleado {

    
    private String NombreD;
    
    
    
    public Directivo() {
    }

    public Directivo(String NombreD) {
    this.NombreD = NombreD;
    }

   
    @Override
    public String ToString() {
        
        return "Empleado " + NombreD +  " ---> Directivo" ;
    }
    
    
    
}
