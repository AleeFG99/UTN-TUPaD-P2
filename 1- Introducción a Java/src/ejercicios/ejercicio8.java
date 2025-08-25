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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, division;
        
        System.out.println("Ingresar numero entero: ");
        num1 = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingresar otro numero entero: ");
        num2 = Double.parseDouble(input.nextLine());
        
        division = num1 / num2;
        
        System.out.println(num1 + " dividido entre " + num2 + " es " + division);
       
    }
    
}
