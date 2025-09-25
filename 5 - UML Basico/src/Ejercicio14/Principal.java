/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio14;

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
         Proyecto proyecto = new Proyecto("Video Corporativo", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto); // Dependencia de creación
    }
    
}
