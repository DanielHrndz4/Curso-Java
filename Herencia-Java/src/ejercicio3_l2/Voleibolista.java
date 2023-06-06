package ejercicio3_l2;

public class Voleibolista extends SeleccionDeVoleibol{
    
    private float peso;
    private String desmarcacion;

    public Voleibolista(String id, String nombre, String apellido, int edad, float peso, String desmarcacion) {
        super(id, nombre, apellido, edad);
        this.peso = peso;
        this.desmarcacion = desmarcacion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDesmarcacion() {
        return desmarcacion;
    }

    public void setDesmarcacion(String desmarcacion) {
        this.desmarcacion = desmarcacion;
    }
    
    public String Partido(){
        return "Partido";
    }
    
    public String Entreno(){
        return "Entreno";
    }
}
