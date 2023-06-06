package llenadoarchivoamigos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClasificacionAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo con la información de sus amigos: ");
        String nombreArchivo = scanner.nextLine();

        System.out.print("Ingrese la edad mínima para clasificar a sus amigos: ");
        int edadMinima = scanner.nextInt();
        scanner.nextLine();

        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            FileWriter archivoMenores = new FileWriter("menores.txt");
            PrintWriter escritorMenores = new PrintWriter(archivoMenores);

            FileWriter archivoMayores = new FileWriter("mayores.txt");
            PrintWriter escritorMayores = new PrintWriter(archivoMayores);

            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombreAmigo = partes[0];
                int edadAmigo = Integer.parseInt(partes[1]);

                if (edadAmigo < edadMinima) {
                    escritorMenores.println(nombreAmigo + "," + edadAmigo);
                } else {
                    escritorMayores.println(nombreAmigo + "," + edadAmigo);
                }
            }

            escritorMenores.close();
            archivoMenores.close();

            escritorMayores.close();
            archivoMayores.close();

            lector.close();
            archivo.close();

            System.out.println("Clasificación completada. Los amigos menores de " + edadMinima + " se han almacenado en 'menores.txt' y los mayores o iguales se han almacenado en 'mayores.txt'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar los archivos: " + e.getMessage());
        }
    }
}
