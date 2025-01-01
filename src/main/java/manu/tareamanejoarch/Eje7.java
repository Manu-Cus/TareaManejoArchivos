package manu.tareamanejoarch;

import java.io.File;
import java.util.Scanner;

public class Eje7 {
    public static void main(String[] args) {
        manera2();
    }
    public static void manera1 (){
             try {
            File archivo = new File("C:\\listado-general.txt");
            Scanner leer = new Scanner(archivo);
            int palabras = 0;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la letra a buscar en primera posicion: ");
            char primera = teclado.next().charAt(0);
            System.out.println("Ingrese en que posicion buscar la letra m: ");
            int posicion = teclado.nextInt();
            while (leer.hasNextLine()) {                
                String palabra = leer.nextLine();
                boolean acepta = true;
                if (palabra.length() < 6) {
                    acepta = false;
                }else{
                    char c = palabra.toLowerCase().charAt(3);
                    if (!(c == 'a' || c == 'e' || c == 'i' 
                            || c == 'o' || c == 'u')) {
                        acepta = false;
                    }
                     if (palabra.charAt(4) != 'M') {
                        acepta = false;
                    }
                     if (palabra.charAt(0) != 'a' || palabra.charAt(3) != 'f') {
                        acepta = false;
                    }
                      if (palabra.charAt(0) != 'g' || palabra.charAt(2) 
                              != 's' || palabra.charAt(5) != 'o') {
                        acepta = false;
                    }
                       if (palabra.charAt(0) != primera || 
                               palabra.charAt(posicion - 1) != 'm') {
                        acepta = false;
                    }
                }
                 if (acepta) {
                    palabras++;
                }
            }
            leer.close();
            System.out.println("El numero de palabras que cumplen "
                    + "con las condiciones es: " + palabras);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void manera2 (){
        try {
            File archivo = new File("C:\\listado-general.txt");
            Scanner leer = new Scanner(archivo);
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la letra a buscar en primera posicion:");
            char primera = teclado.next().charAt(0);
            System.out.println("Ingrese en que posicion buscar la letra m: ");
            int posicion = teclado.nextInt();
            
            while (leer.hasNextLine()) {
                String palabra = leer.nextLine();

                if (palabra.length() >= 4) {
                    char four = palabra.charAt(3);
                    if (!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
                        a++;
                    }
                }
                if (palabra.length() >= 5) {
                    if (palabra.charAt(4) == 'M') {
                        b++;
                    }
                }
                if (palabra.length() >= 4) {
                    if (palabra.charAt(0) == 'a' && 
                            palabra.charAt(3) == 'f') {
                        c++;
                    }
                }
                if (palabra.length() >= 6) {
                    if (palabra.charAt(0) == 'g' && 
                            palabra.charAt(2) == 's' 
                            && palabra.charAt(5) == 'o') {
                        d++;
                    }
                }

                if (palabra.length() >= posicion) {
                    if (palabra.charAt(0) == primera && 
                            palabra.charAt(posicion - 1) == 'm') {
                        e++;
                    }
                }
            }
            leer.close();
            System.out.println("Palabras con vocal en la "
                    + "4ta posicion: " + a);
            System.out.println("Palabras con M mayuscula "
                    + "en la 5ta posicion: " + b);
            System.out.println("Palabras con a en la primera "
                    + "posicion y f en la cuarta posicion: " + c);
            System.out.println("Palabras con g en la primera "
                    + "posicion, s en la tercera y o en la sexta: " + d);
            System.out.println("Palabras con '" + primera + 
                    "' en la primera posicion y m en la posicion " 
                    + posicion + ": " + e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

