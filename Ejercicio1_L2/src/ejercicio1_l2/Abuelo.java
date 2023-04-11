package ejercicio1_l2;

public class Abuelo {
    private String apellido;
    private String nacionalidad;

    public Abuelo(String apellido, String nacionalidad) {
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
     
    public String toString() {
        return "Abuelo{" + "Apellido: " + apellido + " | Nacionalidad: " + nacionalidad +"}";
    }
}
