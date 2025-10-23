/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practico4;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          // Crear lista de animales usando polimorfismo (upcasting)
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Mimi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Fido"));
        
        // Mostrar sonidos con polimorfismo
        System.out.println("=== SONIDOS DE ANIMALES ===");
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido(); // Llamada polimórfica
            System.out.println("---");
        }
        
        // Demostración de downcasting e instanceof
        System.out.println("=== CLASIFICACIÓN ESPECÍFICA ===");
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                Perro perro = (Perro) animal; // Downcasting seguro
                System.out.println(perro.nombre + " es un perro - puede ladrar");
            } else if (animal instanceof Gato) {
                Gato gato = (Gato) animal; // Downcasting seguro
                System.out.println(gato.nombre + " es un gato - puede maullar");
            } else if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal; // Downcasting seguro
                System.out.println(vaca.nombre + " es una vaca - puede mugir");
            }
        }
    }
    
}
