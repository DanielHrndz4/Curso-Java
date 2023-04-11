package ejercicio1_l2;

public class Nieto extends Padre {
    
    public Nieto(String apellido, String nacionalidad){
        super(apellido, nacionalidad);
    }

    public String toString() {
        return "Nieto {" + "Apellido: " + getApellido() + " | Nacionalidad: " + getNacionalidad() +"}";
    }
    
}
