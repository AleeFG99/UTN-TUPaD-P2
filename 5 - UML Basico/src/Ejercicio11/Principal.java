/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Artista artista = new Artista("Soda Stereo", "Rock");
        Cancion cancion = new Cancion("De Música Ligera", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion); // Dependencia de uso
    }
    
}
