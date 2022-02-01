package Tarea1.a9.Personal;

public class Mecanico {

    private String nombre;
    private String dni;
    private int telefono;
    private especialista espe;

    public Mecanico(String nombre, String dni, int telefono, especialista espe){

        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.espe = espe;

    }


    public enum especialista{

        Hidraudica,
        Frenos

    }

}
