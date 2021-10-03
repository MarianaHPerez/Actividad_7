
package Modelo;


public class Oficial extends Operario {
    
    private String NombreOf;

    public Oficial() {
    }

    public Oficial(String NombreOf) {
        this.NombreOf = NombreOf;
    }

    @Override
    public String ToString() {
        return "Empleado " + this.NombreOf + " ---> Operario"+ " ---> Oficial" ;
    }
    
    
    
}
