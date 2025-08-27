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
public class ejercicio8 {
    
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PrecioFinal, PrecioBase, Impuesto, Descuento;
        
        System.out.print("Ingrese el precio del producto: ");
        PrecioBase = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese el porcentaje de impuesto: ");
        Impuesto = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese el porcentaje de descuento: ");
        Descuento = Double.parseDouble(scan.nextLine());
        
        PrecioFinal = calcularPrecioFinal(Impuesto*0.1, Descuento*0.1, PrecioBase);
        
        System.out.println("El precio final : " + PrecioFinal);
    }
    
    private static double calcularPrecioFinal(double impuesto, double descuento, double precioBase){
        double res = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return res;
             
        
    }
    
}




