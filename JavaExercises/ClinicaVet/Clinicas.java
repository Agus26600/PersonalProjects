package JavaExercises.ClinicaVet;

import java.util.List;
import java.util.ArrayList;

public class Clinicas {
    private String nombre;
    private List<Mascota> pacientes;

    public Clinicas(String nombre){
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
    }

    public void agregarPacientes(Mascota mascota){
        pacientes.add(mascota);
        System.out.println(mascota.getNombre() + " ha ingresado a " + nombre + "\n");
    }

    public void mostrarPacientes(){
        System.out.println(" \nPACIENTES REGISTRADOS EN " + nombre.toUpperCase());
        if (pacientes.isEmpty()){
            System.out.println("no hay animales registrados");
            return;
        } else {
            for (Mascota mascota : pacientes ) {
                System.out.println("\nNombre: " + mascota.getNombre());
                System.out.println("Especie: " +mascota.getEspecie());
                System.out.println("Raza: " +mascota.getRaza());
                System.out.println("Edad: " +mascota.getEdad());
            }
        }
    }
    
}
