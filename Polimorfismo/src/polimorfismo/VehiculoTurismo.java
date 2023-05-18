package polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return """
               VehiculoTurismo
               numero de puertas: """ + numeroPuertas + "\nmatricula: " + matricula + "\nmarca: " + marca + "\nmodelo: " + modelo;
    }
  
}
