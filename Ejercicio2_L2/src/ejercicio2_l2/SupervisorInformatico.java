package ejercicio2_l2;

public class SupervisorInformatico extends Programador {
    public SupervisorInformatico(String nombre, String identificacion, int edad, String estado_civil, int salario, int lineas_codigo_hora, String lenguaje_dominante){
        super(nombre, identificacion, edad, estado_civil, salario, lineas_codigo_hora, lenguaje_dominante);
    }
    
    @Override
    public String toString() {
        return "Supervisor Informatico{" + "nombre=" + getNombre() + ", identificacion=" + getIdentificacion() + ", edad=" + getEdad() + ", estado_civil=" + getEstado_civil() + ", salario=" + ((getSalario()*0.3)+getSalario()) + ", lineas_codigo_hora=" + getLineas_codigo_hora() + ", lenguaje_dominante=" + getLenguaje_dominante() + '}';
    }
}
