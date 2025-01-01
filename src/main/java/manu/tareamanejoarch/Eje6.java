package manu.tareamanejoarch;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Eje6 {
    public static void main(String[] args) {
        registroPersonas();
    }
    public static void registroPersonas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas personas registrara? ");
        int personas = teclado.nextInt();
        teclado.nextLine();
        try {
            File salida = new File("C:\\RegistroPersonas.txt");
            PrintWriter escribir = new PrintWriter(salida);
            String principio = "Cedula;Nombre;Apellido;Estado Civil;"
                  + "Telefono;Genero;Tipo de Sangre;Fecha de Nacimiento;Edad";
            escribir.println(principio);
            for (int i = 0; i < personas; i++) {
                System.out.println("Persona numero " + (i+1));
                System.out.println("Cedula: ");
                String cedula = teclado.nextLine().toUpperCase();
                System.out.println("Nombre: ");
                String nombre = teclado.nextLine().toUpperCase();
                System.out.println("Apellido: ");
                String apellido = teclado.nextLine().toUpperCase();
                System.out.println("Estado Cicil: ");
                String estadoCivil = teclado.nextLine().toUpperCase();
                System.out.println("Numero Telefonico: ");
                String telefono = teclado.nextLine().toUpperCase();
                System.out.println("Genero: ");
                String genero = teclado.nextLine().toUpperCase();
                System.out.println("Tipo de sangre: ");
                String sangre = teclado.nextLine().toUpperCase();
                System.out.println("Fecha de nacimiento(DD/MM/AA): ");
                String fechaNaci = teclado.nextLine().toUpperCase();
                System.out.println("Edad: ");
                int edad = teclado.nextInt();
                teclado.nextLine();
                String unir = cedula + ";" + nombre + ";" + apellido 
                        + ";" + estadoCivil + ";" +
                        telefono + ";" + genero + ";" + sangre 
                        + ";" + fechaNaci + ";" + edad;
                escribir.println(unir);
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
