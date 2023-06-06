package clasepersona;

public class ClasePersona {
    
    //ATRIBUTOS
    String nombre;
    String apellido;
    String DUI;
    int edad;
    
    //METODO O CONSTRUCTOR
    public ClasePersona(String nombre, String apellido, String DUI, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DUI = DUI;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String Apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    
    public void setDUI(String DUI){
        this.DUI = DUI;
    }
    public String getDUI(){
        return DUI;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    
    public String mostrar(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" DUI: "+DUI+" Edad: "+edad;
    }
    
    public static void main(String[] args) {
        ClasePersona p1 = new ClasePersona("Daniel", "Hernandez", "06397812-3", 20);
        ClasePersona p2 = new ClasePersona("Jonathan", "Godoy", "06397812-3", 21);

        System.out.println(p1.mostrar());
        System.out.println(p2.mostrar());
    }
    
}
