/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

/**
 *
 * @author Ale
 */
public class ObjetoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // Crear objetos de tipo Estudiante
       

    
         //Estudiante
         
        Estudiante e1 = new Estudiante("Ana", "Pérez", "Programación", 8.5);
        Estudiante e2 = new Estudiante("Juan", "Gómez", "Bases de Datos", 7.0);

        // Mostrar información
        e1.mostrarInfo();
        System.out.println();
        e2.mostrarInfo();

        // Subir y bajar calificaciones
        System.out.println("\n--- Actualizando calificaciones ---");
        e1.subirCalificacion(0.5);
        e2.bajarCalificacion(1.5);

        // Mostrar nuevamente
        System.out.println("\n--- Información final ---");
        e1.mostrarInfo();
        System.out.println();
        e2.mostrarInfo();
        
        
           //Mascota
         // Crear mascota
        Mascota miMascota = new Mascota("Max", "Perro", 3);
        
        // Mostrar información inicial
        System.out.println("=== INFORMACIÓN INICIAL ===");
        miMascota.mostrarInfo();
        
        // Simular paso del tiempo (3 años)
        System.out.println("=== SIMULANDO 3 AÑOS ===");
        for (int i = 0; i < 3; i++) {
            miMascota.cumplirAnios();
        }
        
        // Mostrar información final
        System.out.println("\n=== INFORMACIÓN FINAL ===");
        miMascota.mostrarInfo();
        
        
        //Libro
         // Crear libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        
        // Mostrar información inicial
        System.out.println("=== INFORMACIÓN INICIAL ===");
        libro1.mostrarInfo();
        
        // Intentar modificar con valor inválido
        System.out.println("=== INTENTANDO AÑO INVÁLIDO (3000) ===");
        libro1.setAñoPublicacion(3000);
        
        // Modificar con valor válido
        System.out.println("=== MODIFICANDO A AÑO VÁLIDO (1982) ===");
        libro1.setAñoPublicacion(1982);
        
        // Mostrar información final
        System.out.println("\n=== INFORMACIÓN FINAL ===");
        libro1.mostrarInfo();
        
        
        //Gallina
          // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2); // id=1, edad inicial=2
        Gallina g2 = new Gallina(2, 1); // id=2, edad inicial=1

        // Simular acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estado final de cada gallina
        System.out.println("\n--- Estado final de las gallinas ---");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        //NaveEspacial
         // Crear una nave con 50 unidades de combustible y capacidad máxima de 100
        NaveEspacial nave = new NaveEspacial("Andrómeda", 50, 100);

        // Intentar despegar y avanzar sin recargar
        nave.despegar();
        nave.avanzar(30); // debería fallar si no hay suficiente combustible

        // Recargar y avanzar correctamente
        nave.recargarCombustible(40);
        nave.avanzar(20);

        // Mostrar estado final
        nave.mostrarEstado();
        
    }
    
}

