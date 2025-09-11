/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

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
         // Crear empleados usando diferentes constructores
        Empleado emp1 = new Empleado(1, "Juan Pérez", "Desarrollador", 2500.0);
        Empleado emp2 = new Empleado("María García", "Diseñadora");
        Empleado emp3 = new Empleado("Carlos López", "Analista");
        Empleado emp4 = new Empleado(4, "Ana Rodríguez", "Gerente", 4500.0);
        
        // Aplicar métodos actualizarSalario sobrecargados
        emp1.actualizarSalario(10.0); // 10% de aumento
        emp2.actualizarSalario(500);  // $500 de aumento fijo
        emp3.actualizarSalario(15.0); // 15% de aumento
        
        // Imprimir información de cada empleado
        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        
        // Mostrar total de empleados creados
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Probar algunos getters y setters
        System.out.println("\n=== PRUEBA DE ENCAPSULAMIENTO ===");
        System.out.println("Nombre de emp1: " + emp1.getNombre());
        emp1.setSalario(3000.0);
        System.out.println("Nuevo salario de emp1: $" + emp1.getSalario());
    }
    
}

