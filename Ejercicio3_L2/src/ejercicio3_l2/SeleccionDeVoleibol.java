package ejercicio3_l2;

public class SeleccionDeVoleibol {
    private String id;
    private String nombre;
    private String apellido;
    private int edad;

    public SeleccionDeVoleibol(String id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String Concentrarse(){
        return "Concentrarse";
    }
    
    public String Viajar(){
        return "Viajar";
    }
}
