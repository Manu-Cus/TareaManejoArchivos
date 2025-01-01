package manu.tareamanejoarch;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Eje3 {
    public static void main(String[] args) {
        promediomas8YEmpieceCoE();
    }
    public static void alumnosNotas(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de alumnos: ");
        int numAlumnos = teclado.nextInt();
        teclado.nextLine();
        try {
            File salida = new File("C:\\AlumnosNotas.txt");
            PrintWriter escribir = new PrintWriter(salida);
            String principio = "Nombre;Nota Primer "
                    + "Parcial;Nota Segundo Parcial;Promedio";
            escribir.println(principio);
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println("Nombre del alumno");
                String nombre = teclado.nextLine();
                System.out.println("Nota del 1er parcial");
                double priParcial = teclado.nextDouble();
                System.out.println("Nota del 2do parcial");
                double segParcial = teclado.nextDouble();
                teclado.nextLine();
                double promedio= (priParcial+segParcial)/2;
                String unido = nombre + ";" + priParcial 
                        + ";" + segParcial + ";" + promedio;
                escribir.println(unido);
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void promediomas8YEmpieceCoE(){
        try {
            File archivo = new File("C:\\AlumnosNotas.txt");
            Scanner leer = new Scanner(archivo);
            leer.nextLine();
            System.out.println("Alumnos con promedio mayor a "
                    + "8 y su nombre empieza por 'c' o 'e':");
            while (leer.hasNextLine()) {                
                String cadena = leer.nextLine();
                String []v = cadena.split(";");
                String nombre = v[0].toLowerCase();
                double promedio = Double.parseDouble(v[3]);
                if(promedio > 8 && (nombre.charAt(0)=='c' 
                        ||nombre.charAt(0)=='e') ){
                    System.out.println("Nombre de: " + nombre + 
                            " con promedio de: " + promedio);
            }
            }
            leer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
