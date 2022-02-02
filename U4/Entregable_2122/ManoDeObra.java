package Entregable_2122;

public class ManoDeObra {

    private String nombre ;
    private String descripcion;
    private int horas ;
    private int cantidadObreros;

    public ManoDeObra(String nombre, String descripcion, int horas, int cantidad){

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.cantidadObreros = cantidad;
    }

    public void mostrarInformacion(){

        System.out.println("MANO DE OBRA ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Horas: " + horas);
        System.out.println("Cantidad de Obreros: " + cantidadObreros);
        System.out.println("\n");
    }


}
