package JavaExercises.EntradasCine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de cliente: ");
        String nombre = sc.nextLine();
        Cliente cliente = new Cliente(nombre);
    //Cliente = Tipo | cliente = variable | new = crea | Cliente(nombre) = llama a constructor para crear objeto con nombre asignado

        //para construir un objeto, primero debes llamar a todos los atributos del constructor, no puedes llamar a un atributo y 
        //crear el objeto, ya que cada objeto requiere ciertos atributos, aquí primero recolecta los atributos del constructor Boletos
        System.out.println("Nombre de la película: ");
        String pelicula = sc.nextLine();
        System.out.println("Precio de la entrada: $");
        Double precio = sc.nextDouble();

        Boletos entrada = new Boletos(pelicula, precio);

        cliente.comprarBoleto(entrada);
        cliente.mostrarTicket();

        sc.close();
    }    
}
