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
public class Input {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nombre; 
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());  
        
        System.out.println("Nombre: " + nombre + ". Edad: " + edad);
    }
}

