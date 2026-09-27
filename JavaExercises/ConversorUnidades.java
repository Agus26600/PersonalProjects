package JavaExercises;

import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int opcion;
        double cantidad; 
        double resultado;

        System.out.println("1. Metros a centímetros");
        System.out.println("2. Centímetros a metros");
        System.out.println("3. kilometros a Metros");
        System.out.println("4. metros a kilometros");

        System.out.println("Seleccione la opción que quiera (1-4)");
        opcion = entrada.nextInt();
        System.out.println("ingrese la cantidad a convertir");
        cantidad = entrada.nextDouble();

        switch (opcion) {
            case 1:
                resultado = cantidad * 100;
                System.out.println("el valor es "  + resultado +"cm");
                break;
            case 2:
                resultado = cantidad /100;
                System.out.println("el valor es " + resultado +"m");
                break;
            case 3:
                resultado = cantidad * 1000;
                System.out.println("el valor es " + resultado +"m");
                break;
            case 4:
                resultado = cantidad /1000;
                System.out.println("el valor es " + resultado +"km");

            default:
                System.out.println("Opción inválida.");
                break;
        }
        entrada.close();

    }
}