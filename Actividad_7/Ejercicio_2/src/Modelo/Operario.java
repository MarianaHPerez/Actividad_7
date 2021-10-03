
package Modelo;


public class Operario extends Empleado {
    
    private String NombreOP;

    public Operario() {
    }

    public Operario(String NombreOP) {
        this.NombreOP = NombreOP;
    }

    public String getNombreOP() {
        return NombreOP;
    }

    public void setNombreOP(String NombreOP) {
        this.NombreOP = NombreOP;
    }
    
    @Override
    public String ToString (){
    
        return "Empleado " + this.NombreOP + " ---> Operario";
       
    
    }
    
}
