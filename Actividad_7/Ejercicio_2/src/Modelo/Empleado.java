
package Modelo;


public class Empleado {
   
    
    private String Nombre;

    
    public Empleado() {
    }

    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }

    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }
    
    
    public String ToString (){
    
        
        return "Empleado " + this.Nombre ;
    
    }
}
