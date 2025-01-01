package manu.tareamanejoarch;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Eje5 {
    public static void main(String[] args) {
        baseMasQueAltura();
    }
    public static void triangulos(){
        Scanner teclado = new Scanner(System.in);
        try {
            File salida = new File("C:\\TriangulosRectangulos.csv");
            PrintWriter escribir = new PrintWriter(salida);
            String principio ="Base|Altura|Area Total";
            escribir.println(principio);
            while (true) {                
                System.out.println("Ingrese el valor de la base: ");
                double base = teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                double altura = teclado.nextDouble();
                teclado.nextLine();
                double area = (base * altura)/2;
                String unir = base + "|" + altura +"|" + area;
                escribir.println(unir);
                System.out.println("Quieres ingresar otro triangulo? si/no");
                String respuesta = teclado.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    break;
                }
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void baseMasQueAltura(){
        try {
            File archivo = new File("C:\\TriangulosRectangulos.csv");
            Scanner leer = new Scanner(archivo);
            leer.nextLine();
            System.out.println("Areas donde la base es mayor que la altura: ");
            while (leer.hasNextLine()) {                
                String cadena = leer.nextLine();
                String []v=cadena.split("\\|");
                double base=Double.parseDouble(v[0]);
                double altura=Double.parseDouble(v[1]);
                double area=Double.parseDouble(v[2]);
                if (base > altura) {
                    System.out.println("El area " + area + 
                            " tiene la base mayor");
                    System.out.println("Su base es de " + 
                            base + " y su altura de " +altura);
                }
            }
            leer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
