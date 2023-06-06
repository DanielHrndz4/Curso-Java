package ejemploenums;

public class EjemploEnums {
    public static void main(String[] args) {
        
        // Acceder solo a los daro de mari:
        Conocidos x = Conocidos.mari;
        
        System.out.println("Nombre: " + x.getNombre());
        System.out.println("Universidad: " + x.getUniv());
        System.out.println("Edad: " + x.getEdad());
        System.out.println("Por cariño le decimos: " + x);
        
        x.setEdad(16);
        
        System.out.println("");
        for(Conocidos c: Conocidos.values())
            System.out.printf("%-20s %-6s %2d %-10s%n", 
                    c.getNombre(),
                    c.getUniv(),
                    c.getEdad(),
                    c);

    }
}
