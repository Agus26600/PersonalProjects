package JavaExercises.ClinicaVet;

import java.util.List;
import java.util.ArrayList;

public class Citas {
    private String mes;
    private String horario;
    private int dia;
    private List<String> reservado;

    public Citas(String mes, String horario, int dia){
        this.mes = mes;
        this.horario = horario;
        this.dia = dia;
        this.reservado = new ArrayList<>();
    }

    public void registrarCita(){
        reservado.add( " " + mes + " " + dia + " " + horario);
        System.out.println("cita reservada para el " + dia + " de " + mes + " a las " + horario);
    }

}
