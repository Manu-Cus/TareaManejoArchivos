package manu.tareamanejoarch;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Eje2 {
    public static void main(String[] args) {
        longImparOEmpiA();
    }
    public static void nombreSoli(){
        Scanner teclado = new Scanner(System.in);
        try {
            File salida = new File("C:\\NombresPersonas.csv");
            PrintWriter escribir = new PrintWriter(salida);
            String principio = "Nombre de Personas";
            escribir.println(principio);
            while (true) {                
                System.out.println("Ingrese un nombre: ");
                String nombre = teclado.nextLine().toLowerCase();
                escribir.println(nombre);
                System.out.println("Desa ingresar otro nombre, si/no");
                String validacion = teclado.nextLine();
                if (!validacion.equalsIgnoreCase("si")) {
                    break;
                }
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void mayor3YEmpiezab(){
        try {
            File archivo = new File("C:\\NombresPersonas.csv");
            Scanner leer = new Scanner(archivo);
            System.out.println("Nombres con longitud mayor "
                    + "a 3 y empiezan por b: ");
            leer.nextLine();
            while (leer.hasNextLine()) {                
                String nombre = leer.nextLine();
                if (nombre.length() > 3 && nombre.charAt(0) == 'b') {
                    System.out.println(nombre);
                } 
            }
            leer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Eje 2 de lectura
    public static void longImparOEmpiA(){
        try {
            File archivo = new File("C:\\NombresPersonas.csv");
            Scanner leer = new Scanner(archivo);
            System.out.println("Nombres con logitud impar "
                    + "o empieza por a:  ");
            while (leer.hasNextLine()) {                
                String nombre = leer.nextLine();
                if (nombre.length() % 2 != 0 || nombre.charAt(0) == 'a') {
                    System.out.println(nombre);
                }
            }
            leer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
