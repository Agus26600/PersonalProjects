package JavaExercises.ClinicaVet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NOMBRE DE LA VETERINARIA: ");
        String nombreVet = sc.nextLine();
        Clinicas veterinaria = new Clinicas(nombreVet);

        int opcion;
        do {
            System.out.println("MENÚ");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Ver lista de pacientes");
            System.out.println("3. Registrar cita");
            System.out.println("selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); //para limpiar el buffer

            switch (opcion) {
                case 1: {
                    System.out.println("\nDATOS DEL PACIENTE");
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Especie: ");
                    String especie = sc.nextLine();
                    System.out.println("Raza: ");
                    String raza = sc.nextLine();
                    System.out.println("Edad: ");
                    int edad = sc.nextInt();

                    Mascota mascota = new Mascota(nombre, especie, raza, edad);
                    veterinaria.agregarPacientes(mascota);
                    sc.nextLine();
                    break;
                }

                case 2:
                    veterinaria.mostrarPacientes();
                    sc.nextLine();
                    break;
                case 3: {
                    System.out.println("\nIngresa la fecha: ");
                    System.out.println("Dia: ");
                    int dia = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Mes: ");
                    String mes = sc.nextLine();
                    System.out.println("Horario: ");
                    String horario = sc.nextLine();

                    Citas agenda = new Citas(mes, horario, dia);
                    agenda.registrarCita();
                    sc.nextLine();
                    break;
                }
            }
        } while(opcion !=4);
        
        sc.close();
      

    }
}
