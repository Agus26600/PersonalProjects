package JavaExercises.EntradasCine;

public class Cliente {
    private String nombre;
    private Boletos boletos;

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    public void comprarBoleto(Boletos boletos){
        this.boletos = boletos;
        System.out.println("boleto comprado, propietario : "+ nombre);
    }
    
    public void mostrarTicket(){
        System.out.println("\nTICKET DE ENTRADA");
        System.out.println("Cliente: " + nombre);
        if (boletos != null){
            System.out.println("pelicula: "+ boletos.getPelicula());
            System.out.println("total: "+ boletos.getPrecio());
        } else {
            System.out.println("Sin boleto asignado");
        }
    }
}
