package manu.tareamanejoarch;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
        produVocal();
    }
    public static void factura(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas facturas ingresara: ");
        int numFacturas = teclado.nextInt();
        teclado.nextLine();
        try {
            File salida= new File("C:\\FacturasDetalladas.csv");
            PrintWriter escribir = new PrintWriter(salida);
            String principio = "Producto-Cantidad-Precio-Total";
            escribir.println(principio);
            for (int i = 0; i < numFacturas; i++) {
                System.out.println("Factura " + (i+1) + " /"+ numFacturas);
                System.out.println("Nombre del producto: ");
                String producto = teclado.nextLine();
                System.out.println("Cantidad del producto: ");
                int cantidad = teclado.nextInt();
                System.out.println("Precio del producto: ");
                double precio = teclado.nextDouble();
                teclado.nextLine();
                double total = cantidad * precio;
                String unir = producto + "-" 
                     + cantidad + "-" + precio + "-" + total;
                escribir.println(unir);
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void entre10y20(){
        try {
            File archivo = new File("C:\\FacturasDetalladas.csv");
            Scanner leer = new Scanner(archivo);
            System.out.println("Productos con precio "
                    + "entre 10 y 20 dolares:");
            boolean siExiste = false;
            leer.nextLine();
            while (leer.hasNextLine()) {                
                String cadena = leer.nextLine();
                String []v= cadena.split("-");
                String producto = v[0];
                double total = Double.parseDouble(v[3]);
                if (total >= 10 && total <= 20) {
                    System.out.println("El produto " + producto + 
                            "tiene un total de: " + total);
                    siExiste = true;
                }
            }
            leer.close();
            if (!siExiste) {
                System.out.println("No existe ningun producto "
                        + "con esas caracteristiscas");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void produVocal(){
        try {
            File archivo = new File("C:\\FacturasDetalladas.csv");
            Scanner leer = new Scanner(archivo);
            leer.nextLine();
            boolean existe = false;
            System.out.println("Productos que empiezan con vocal: ");
            while (leer.hasNextLine()) {                
                String cadena = leer.nextLine();
                String []v=cadena.split("-");
                String producto = v[0];
                char inicio = producto.toLowerCase().charAt(0);
                if (inicio == 'a' || inicio == 'e' || inicio == 'i' 
                        || inicio == 'o' || inicio == 'u'){
                    System.out.println("El producto es: " +producto);
                    existe = true;
                }
            }
            leer.close();
            if (!existe) {
                System.out.println("Ningun producto empieza por vocal ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
