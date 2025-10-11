/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practico3;



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
           System.out.println("=== SISTEMA UNIVERSITARIO ===\n");
        
        // 1. Crear universidad
        Universidad universidad = new Universidad("Universidad Nacional");
        
        // 2. Crear al menos 3 profesores
        Profesor prof1 = new Profesor("P001", "Dr. Carlos Méndez", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Dra. Ana López", "Física");
        Profesor prof3 = new Profesor("P003", "Dr. Roberto Díaz", "Programación");
        
        // 3. Crear 5 cursos
        Curso curso1 = new Curso("MAT101", "Cálculo I");
        Curso curso2 = new Curso("MAT102", "Cálculo II");
        Curso curso3 = new Curso("FIS101", "Física General");
        Curso curso4 = new Curso("PROG101", "Programación I");
        Curso curso5 = new Curso("PROG102", "Programación II");
        
        // 4. Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        // 5. Asignar profesores a cursos
        universidad.asignarProfesorACurso("MAT101", "P001");
        universidad.asignarProfesorACurso("MAT102", "P001");
        universidad.asignarProfesorACurso("FIS101", "P002");
        universidad.asignarProfesorACurso("PROG101", "P003");
        universidad.asignarProfesorACurso("PROG102", "P003");
        
        // 6. Listar cursos con profesores y profesores con cursos
        universidad.listarCursos();
        universidad.listarProfesores();
        
        // Mostrar cursos de cada profesor
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();
        
        // 7. Cambiar profesor de un curso
        System.out.println("\n=== CAMBIAR PROFESOR DE CURSO ===");
        universidad.asignarProfesorACurso("PROG102", "P001");
        curso5.mostrarInfo();
        prof1.listarCursos();
        prof3.listarCursos();
        
        // 8. Remover un curso
        System.out.println("\n=== ELIMINAR CURSO ===");
        universidad.eliminarCurso("MAT102");
        universidad.listarCursos();
        prof1.listarCursos();
        
        // 9. Remover un profesor
        System.out.println("\n=== ELIMINAR PROFESOR ===");
        universidad.eliminarProfesor("P002");
        universidad.listarProfesores();
        universidad.listarCursos();
        
        // 10. Mostrar reporte
        universidad.mostrarReporteCursosPorProfesor();
    }
    
}
