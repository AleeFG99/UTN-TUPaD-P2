/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Ale
 */
public class EditorVideo {
    // Dependencia de creación: crea un Render dentro del método
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // creado aquí
        System.out.println("Render exportado: " + render);
    }
    
}
