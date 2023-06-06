package ejemploenums;

public enum Conocidos {
 // Objetos:
    pancho("Francisco Meléndez", "UCA", 37),
    chepe("José Ordóñez", "UTEC", 33),
    mari("María Pérez", "UNIVO", 21),
    majo("María José", "UDB", 19),
    memo("Guillermo Alas", "UJMD", 24);
    
    private String nombre;
    private String univ;
    private int edad;

    private Conocidos(String nombre, String univ, int edad) {
        this.nombre = nombre;
        this.univ = univ;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUniv() {
        return univ;
    }

    public int getEdad() {
        return edad;
    }
    
}
