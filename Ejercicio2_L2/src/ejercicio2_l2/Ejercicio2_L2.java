package ejercicio2_l2;

public class Ejercicio2_L2 {

    public static void main(String[] args) {
        Programador programador = new Programador("Daniel","12345",20,"Soltero",365,300, "PHP");
        SupervisorInformatico supervisor = new SupervisorInformatico("Daniel","12345",20,"Soltero",365,300, "PHP");

        System.out.println(programador.toString());
        System.out.println(supervisor.toString());

    }
    
}
