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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, suma, resta, multiplicacion, division;
        
        System.out.println("Ingrese un numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese otro numero entero (Distinto a cero): ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = (num1 + num2);
        resta = (num1 - num2);
        multiplicacion = (num1 * num2);
        division = (num1 / num2);
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    
    }
    
}

