/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Ale
 */
public class Reproductor {
    // Dependencia de uso: el método recibe Cancion, no se guarda como atributo
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + 
                           " - Artista: " + cancion.getArtista().getNombre());
    }
    
}
