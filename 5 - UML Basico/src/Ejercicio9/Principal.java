/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio9;

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
        Paciente paciente = new Paciente("Juan Pérez", "OSDE");
        Profesional doctor = new Profesional("Dra. Gómez", "Cardiología");

        CitaMedica cita = new CitaMedica("2025-10-01", "10:30", paciente, doctor);

        System.out.println(cita);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
    }
    
}
