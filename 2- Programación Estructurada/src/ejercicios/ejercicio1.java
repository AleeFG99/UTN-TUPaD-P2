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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
               
    int anio; // Variable para guardar el año ingresado
    
    System.out.print("Ingrese un año: "); // Solicita al usuario que ingrese un año
    anio = input.nextInt();  // Lee el número ingresado por el usuario y lo almacena en la variable 'ano'
    
    if (anio % 2 == 0 ) { // Condición: si el año es divisible por 2 (resto = 0) se considera bisiesto
         System.out.println("El año " + anio + " es bisiesto.");
         } else {
          System.out.println("El año " + anio + " no es bisiesto.");
         }
    } 


}



        
