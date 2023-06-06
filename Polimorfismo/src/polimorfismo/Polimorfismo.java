package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Vehiculo []carros = new Vehiculo[4];
        
        carros[0] = new Vehiculo("1827","BMW","M3");
        carros[1] = new VehiculoCarga(5,"8670","XYZ","X98");      
        carros[2] = new VehiculoTurismo(8,"9274","VGT","I90");
        carros[3] = new VehiculoDeportivo(10,"3624","BDT","P9I");
        
        for (Vehiculo obj: carros){
            System.out.println(obj.mostrarDatos() + "\n");
        }
    }
    
}
