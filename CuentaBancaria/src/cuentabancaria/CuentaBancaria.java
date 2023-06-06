package cuentabancaria;

public class CuentaBancaria {
    
    private String titular;
    private double cantidad;
    
    public CuentaBancaria(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    
    public CuentaBancaria(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return titular;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    public double getCantidad(){
        return cantidad;
    }
    
    public void Ingresar(double cantidadIngresar){
        if (cantidadIngresar > 0){
            this.cantidad = this.cantidad + cantidadIngresar;
        }else{
            System.out.println("La cantidad debe ser mayor a $0\n");
        }
    }    
    
    public void Retirar(double cantidadRetirar){
        if (this.cantidad < cantidadRetirar){
            System.out.println("Cantidad solicitada no disponible\n");
        }else{
            this.cantidad = this.cantidad - cantidadRetirar;
        }
    }
    
    public String toString(){
        return "Titular: "+this.titular+"\n"+"Cantidad disponible: $"+this.cantidad;
    }
    public static void main(String[] args) {
        CuentaBancaria persona = new CuentaBancaria("Daniel Hernandez", 0.0);
        
        persona.Ingresar(150);
        persona.Retirar(200);
        //persona.Ingresar(600);
        System.out.println(persona.toString());
    }
    
}
