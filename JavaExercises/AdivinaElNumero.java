package JavaExercises;
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int suposicion = 0;

        System.out.println("adivina el número entre 1 y 100");

        while (suposicion != numeroSecreto) {
            System.out.print("intento: ");
            suposicion = scanner.nextInt();
            intentos++;

            if (suposicion < numeroSecreto) {
                System.out.println("Más alto...");
            } else if (suposicion > numeroSecreto) {
                System.out.println("Más bajo...");
            } else {
                System.out.println("Correctooo, lo lograste en " + intentos + " intentos.");
            }
        }
        scanner.close();
    }
}