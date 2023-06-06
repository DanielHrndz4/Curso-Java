package creararchivotexto02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CrearArchivoTexto02 {

    public static void main(String[] args) {
        FileWriter buffer = null;
        PrintWriter salida = null;
        try {
            Scanner teclado = new Scanner(System.in);
            buffer = new FileWriter("Datos.txt", true);
            salida = new PrintWriter(buffer);
            String cadena;
            System.out.println("Introduzca texto y pulse <Enter>,");
            System.out.println("o solo pulse <Enter> para terminar:");
            cadena = teclado.nextLine();
            while (cadena.length() != 0){
                salida.println(cadena);
                cadena = teclado.nextLine();
            }
            salida.flush();
        }
        catch (IOException excepcion) {
            System.out.println("Error de E/S");
        }
        finally{
            salida.close();
        }

    }
    
}
