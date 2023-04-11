package ejercicio3_l2;

public class Entrenador extends Voleibolista{
    private String federacion;

    public Entrenador(String federacion, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.federacion = federacion;
    }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    
    public String DirigirPartido(){
        return "Dirigir Partido";
    }
    
    public String DirigirEntrenamiento(){
        return "Dirigir Entrenamiento";
    }
}
