package tablaenventana;

public enum Persona {
    
    guie("Guillermo", "Cortés", 125.21),
    mari("Mari", "Posas", 250.14),
    alam("Alam", "Brito", 180.99),
    lola("Lola", "Mento", 350.05),
    elton("Elton", "Tito", 50.00),
    elsa("Elsa", "Paton", 175.00),
    elvis("Elvis", "Nieto", 200.31),
    zoila("Zoila", "Vaca", 215.23),
    aquiles("Aquiles", "Castro", 87.50),
    elba("Elba", "Tracio", 241.15),
    amor("Amor", "Jurado", 275.25),
    marci("Marciana", "Luna", 310.12),
    aitor("Aitor", "Menta", 67.72),
    coco("Coco", "Drilo", 315.30),
    cris("Crisantemina", "Siempreviva", 35.49),
    marg("Margarito", "Floripundio", 120.73),
    pere("Pere", "Gil", 40.28);
    
    protected String nombre;
    protected String apellido;
    protected double salario;

    private Persona(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
