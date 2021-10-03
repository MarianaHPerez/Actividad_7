
package Modelo;


public class Tecnico extends Operario {
    
    private  String NombreTec;

    
    
    public Tecnico() {
    }

    
    public Tecnico(String NombreTec) {
        this.NombreTec = NombreTec;
    }

    @Override
    public String ToString() {
        return "Empleado " + this.NombreTec + " ---> Operario"+ " ---> Tecnico";
    }
    
    
    
}
