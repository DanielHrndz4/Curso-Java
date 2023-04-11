package ejercicio1_l2;

public class Padre extends Abuelo {
    
    public Padre(String apellido, String nacionalidad){
        super(apellido, nacionalidad);
    }

    public String toString() {
        return "Padre {" + "Apellido: " + getApellido() + " | Nacionalidad: " + getNacionalidad() +"}";
    }
    
}
