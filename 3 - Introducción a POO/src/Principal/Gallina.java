/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Ale
 */
public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;          // en meses o años (definir según preferencia)
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0; // inicia en 0
    }

    // Método para simular que la gallina pone un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método para simular el envejecimiento de la gallina
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Edad: " + edad);
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-----------------------------");
    }
    
}
