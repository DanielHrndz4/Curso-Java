package polimorfismo;

public class VehiculoCarga extends Vehiculo {
    private int carga;

    public VehiculoCarga(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    @Override
    public String mostrarDatos() {
        return """
               Vehiculo de Carga
               carga: """ + carga + "\nmatricula: " + matricula + "\nmarca: " + marca + "\nmodelo: " + modelo;
    }
}
