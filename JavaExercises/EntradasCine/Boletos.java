package JavaExercises.EntradasCine;

public class Boletos {
    private String pelicula;
    private double precio;

    //constructor
    public Boletos(String pelicula, double precio){
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public String getPelicula(){
        return pelicula;
    }

    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        if (precio >= 0){
            this.precio = precio;
        } else {
            System.out.println("no puede ser menos de 0$");
        }
    }

}
