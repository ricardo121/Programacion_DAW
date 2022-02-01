package Entregable_1920.Pizzeria;

public class Ingrediente {

    private String nombre;

    private int calorias;

    public Ingrediente(String nombre, int calorias){

        this.nombre = nombre;
        this.calorias = calorias;

    }


    public Ingrediente(){

        this.nombre = "Queso";
        this.calorias = 250;

    }

    public void mostrarInfo(){

        System.out.println("Ingredientes: " + nombre + " - " + calorias+ " Calorias por 100g ");

    }

}
