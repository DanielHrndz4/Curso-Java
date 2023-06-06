package llenadoarchivoamigos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LlenadoArchivoAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter archivo = new FileWriter("misamigos.txt");
            PrintWriter escritor = new PrintWriter(archivo);
            escritor.println("Amigos de Jaimito\n");
            
            FileWriter archivoMenores = new FileWriter("menores.txt");
            PrintWriter escritorMenores = new PrintWriter(archivoMenores);
            escritorMenores.println("Amigos menores de 10 años\n");

            FileWriter archivoMayores = new FileWriter("mayores.txt");
            PrintWriter escritorMayores = new PrintWriter(archivoMayores);
            escritorMayores.println("Amigos mayores de 10 años\n");

            boolean continuar = true;
            while (continuar) {
                System.out.print("Ingrese el nombre del amigo (o 'salir' para terminar el archivo): ");
                String nombreAmigo = scanner.nextLine();

                if (nombreAmigo.equalsIgnoreCase("salir")) {
                    continuar = false;
                } else {
                    System.out.print("Ingrese la edad de " + nombreAmigo + ": ");
                    int edadAmigo = scanner.nextInt();
                    scanner.nextLine();

                    if (edadAmigo < 10) {
                        escritorMenores.println(nombreAmigo + " - " + edadAmigo);
                    } else {
                        escritorMayores.println(nombreAmigo + " - " + edadAmigo);
                    }
                    escritor.println(nombreAmigo + " - " + edadAmigo);
                }
            }

            escritor.close();
            archivo.close();
            archivoMenores.close();
            escritorMenores.close();
            archivoMayores.close();
            escritorMayores.close();
            System.out.println("Archivos creados exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }
}

