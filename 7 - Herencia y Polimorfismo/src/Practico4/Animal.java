/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico4;

/**
 *
 * @author Ale
 */
public class Animal {
    protected String nombre;
    protected String tipo;
    
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico");
    }
    
    public void describirAnimal() {
        System.out.println("Soy un " + tipo + " llamado " + nombre);
    }
    
}
