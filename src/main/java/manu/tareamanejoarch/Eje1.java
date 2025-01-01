package manu.tareamanejoarch;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Eje1 {
    public static void main(String[] args) {
        generarNumAle();
        System.out.println("Eje 1");
        multiPlos();
        System.out.println("Eje 2");
        multi4Ypare();
    }
    public static void generarNumAle(){
        try {
            File salida = new File("C:\\NumerosAleatorios.csv");
            PrintWriter escribir = new PrintWriter(salida);
            Random random= new Random();
            String principio = "Numeros_Aleatorios";
            escribir.println(principio);
            for (int i = 0; i < 1000; i++) {
                int num= random.nextInt(496)+5;
                escribir.println(num);
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Eje 1 de lectura
    public static void multiPlos(){
        try {
            int multi21 = 0;
            int multi32 = 0;
            int multi41 = 0;
            int multi52 = 0;
            ArrayList<Integer> list21 = new ArrayList<>();
            ArrayList<Integer> list32 = new ArrayList<>();
            ArrayList<Integer> list41 = new ArrayList<>();
            ArrayList<Integer> list52 = new ArrayList<>();
            File archivo = new File("C:\\NumerosAleatorios.csv");
            Scanner leer = new Scanner(archivo);
            leer.nextLine();
            while (leer.hasNextLine()) {                
             int numero = Integer.parseInt(leer.nextLine());
                if (numero % 21 == 0) {
                    multi21++;
                    list21.add(numero);
                }
                if (numero % 32 == 0) {
                    multi32++;
                    list32.add(numero);
                }
                if (numero % 41 == 0) {
                    multi41++;
                    list41.add(numero);
                }
                if (numero % 52 == 0) {
                    multi52++;
                    list52.add(numero);
                }
            }
            leer.close();
            System.out.println("Cantidad de multiplos de 21: " + multi21);
            System.out.println("Los numeros son: " + list21);
            System.out.println("Cantidad de multiplos de 32: " + multi32);
            System.out.println("Los numeros son: " + list32);
            System.out.println("Cantidad de multiplos de 41: " + multi41);
            System.out.println("Los numeros son: " + list41);
            System.out.println("Cantidad de multiplos de 52: " + multi52);
            System.out.println("Los numeros son: " + list52);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Eje 2 de lectura
    public static void multi4Ypare(){
        try {
            int suma = 0;
            int contador=0;
            ArrayList<Integer> numeros = new ArrayList<>();
            File archivo = new File("C:\\NumerosAleatorios.csv");
            Scanner leer = new Scanner(archivo);
            leer.nextLine();
            while (leer.hasNextLine()) {                
                int numero = Integer.parseInt(leer.nextLine());
                numeros.add(numero);
            }
            leer.close();
            for (int i = 1; i < numeros.size(); i+=2) {
                if (numeros.get(i) % 4 == 0) {
                    suma +=numeros.get(i);
                }
            }
            System.out.println("La suma de los multiplos "
                    + "de 4 en posicion par es: " + suma);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
