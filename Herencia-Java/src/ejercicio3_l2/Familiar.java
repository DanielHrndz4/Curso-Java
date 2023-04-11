package ejercicio3_l2;

public class Familiar extends SeleccionDeVoleibol {
    private float costo_entrenamiento;
    private float aprotacion_suplementos;

    public Familiar(float costo_entrenamiento, float aprotacion_suplementos, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.costo_entrenamiento = costo_entrenamiento;
        this.aprotacion_suplementos = aprotacion_suplementos;
    }

    public float getCosto_entrenamiento() {
        return costo_entrenamiento;
    }

    public void setCosto_entrenamiento(float costo_entrenamiento) {
        this.costo_entrenamiento = costo_entrenamiento;
    }

    public float getAprotacion_suplementos() {
        return aprotacion_suplementos;
    }

    public void setAprotacion_suplementos(float aprotacion_suplementos) {
        this.aprotacion_suplementos = aprotacion_suplementos;
    }
    
    public String Motivar(){
        return "Motivar";
    }
    
}
