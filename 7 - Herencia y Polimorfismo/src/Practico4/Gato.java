/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico4;

/**
 *
 * @author Ale
 */
public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre, "Gato");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
    
}
