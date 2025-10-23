/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practico2;

/**
 *
 * @author Ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array de figuras usando polimorfismo
        Figura[] figuras = {
            new Circulo("Círculo A", 5.0),
            new Rectangulo("Rectángulo B", 4.0, 6.0),
            new Circulo("Círculo C", 3.0)
        };
        
        // Mostrar áreas usando polimorfismo
        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    
    }
    
}
