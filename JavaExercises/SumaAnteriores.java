package JavaExercises;

import java.util.Scanner;

public class SumaAnteriores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("ingresa el número");
        numero = entrada.nextInt();

        for (int i=1; i<=numero; i++){
            suma = suma + i;
        }
        System.out.println("la suma de todos los números es " + suma);

        entrada.close();
    }
}
