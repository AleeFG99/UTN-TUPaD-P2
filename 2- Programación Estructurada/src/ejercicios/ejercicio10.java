/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class ejercicio10 {
     // Método para calcular el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        // Aplicamos la fórmula: NuevoStock = StockActual − CantidadVendida + CantidadRecibida
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        // Llamamos al método para calcular el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostramos el resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
}


