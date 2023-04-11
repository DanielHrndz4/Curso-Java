package ejercicio1_l2;

public class Ejercicio1_L2 {

    public static void main(String[] args) {
        Abuelo abuelo = new Abuelo("Hernandez","Salvadoreño");
        Padre padre = new Padre("Hernandez","Salvadoreño");
        Nieto nieto = new Nieto("Hernandez","Salvadoreño");
        
        System.out.println(abuelo.toString());
        System.out.println(padre.toString());
        System.out.println(nieto.toString());
  
    }
    
}
