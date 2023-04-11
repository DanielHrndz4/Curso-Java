package ejercicio2_l2;

public class Programador {
    private String nombre;
    private String identificacion;
    private int edad;
    private String estado_civil;
    private int salario;
    private int lineas_codigo_hora;
    private String lenguaje_dominante;

    public Programador(String nombre, String identificacion, int edad, String estado_civil, int salario, int lineas_codigo_hora, String lenguaje_dominante) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.salario = salario;
        this.lineas_codigo_hora = lineas_codigo_hora;
        this.lenguaje_dominante = lenguaje_dominante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getLineas_codigo_hora() {
        return lineas_codigo_hora;
    }

    public void setLineas_codigo_hora(int lineas_codigo_hora) {
        this.lineas_codigo_hora = lineas_codigo_hora;
    }

    public String getLenguaje_dominante() {
        return lenguaje_dominante;
    }

    public void setLenguaje_dominante(String lenguaje_dominante) {
        this.lenguaje_dominante = lenguaje_dominante;
    }

    @Override
    public String toString() {
        return "Programador{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", edad=" + edad + ", estado_civil=" + estado_civil + ", salario=" + salario + ", lineas_codigo_hora=" + lineas_codigo_hora + ", lenguaje_dominante=" + lenguaje_dominante + '}';
    }
    
}
