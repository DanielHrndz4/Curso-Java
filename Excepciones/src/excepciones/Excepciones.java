package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        int numerador;
        int denominador;
        int resultado;
        boolean bandera = false;
        
        Scanner t = new Scanner(System.in);
        
        do{
            try{
                System.out.println("DIVISION DE DOS NUMERO\n");
                System.out.print("Digite el numerador: ");
                numerador = t.nextInt();
                System.out.print("Digite el denominador");
                denominador = t.nextInt();
                resultado = numerador/denominador;

                bandera = true;

                System.out.println("Resultado: "+resultado);
            }catch(InputMismatchException exc){
                System.out.println("Debes ingresar datos numericos.");
                t.nextLine();
            }catch(ArithmeticException ar){
                System.out.println("No es posible dividir entre 0");
            }
        } while (bandera == false);
           
        
        //TRY CATCH COMANDO ESTRUCTURADO
        /*try{
            int [] array = {2,4,6,8};
        
            for(int i = 0; i< array.length; i++){
                System.out.println(array[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }*/
            
    }
    
}
