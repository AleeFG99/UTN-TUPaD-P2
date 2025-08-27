/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;


/**
 *
 * @author Ale
 */
public class ejercicio13 {
    public static void imprimirPrecios(double[] precios, int index) {
        if (index >= precios.length) return;
        System.out.println("Precio: $" + precios[index]);
        imprimirPrecios(precios, index + 1);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
    }
    
}


