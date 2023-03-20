package numerorandom;
import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digita un numero: ");
        numero = teclado.nextInt();
        
        Random r = new Random();
        int numRandom = r.nextInt(10);
        
        int resultado = numero * numRandom;
        
        System.out.println("Numero random: "+numRandom);
        System.out.println("Resultado: "+resultado);
    }
    
}
