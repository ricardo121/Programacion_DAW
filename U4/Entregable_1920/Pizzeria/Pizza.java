package Entregable_1920.Pizzeria;

import java.util.Arrays;
import java.util.Scanner;

public class Pizza {

    private Ingrediente [] ingrediente ;

    private Size size;

    private int numIngredientes;

    public Pizza( Ingrediente ingrediente){

        this.size = size.Familiar;

        numIngredientes = 0;
        this.ingrediente = new Ingrediente[3];
        this.ingrediente[numIngredientes] =  ingrediente;
        numIngredientes++;

    }

    public Pizza(Size size, Ingrediente ingrediente){

        this.size = size;

        numIngredientes = 0;
        this.ingrediente = new Ingrediente[3];
        this.ingrediente[numIngredientes] =  ingrediente;
        numIngredientes++;

    }




     public static void mostrarTamanyos(){

        for (Size s : Size.values()) {
            System.out.println(s);
        }

    }


    public void agregarIngrediente(Ingrediente ingrediente){

        if (numIngredientes < this.ingrediente.length){

            this.ingrediente[numIngredientes] =  ingrediente;
            numIngredientes++;

        }else{
            System.out.println("Solo se pueden introducir 3 Ingredientes" );
        }

    }


    public void verIngredientes(){


    }



    public void mostrarInformacion(){

        System.out.println("PIZZA: ");

        System.out.println("Tamaño de la Pizza : " + size);

        for (int i = 0; i < numIngredientes; i++) {

            ingrediente[i].mostrarInfo();

        }

        System.out.println("\n");

    }


    public void cantidadIngredientes(){

        System.out.println("Cantidad de ingredientes que tiene: " + numIngredientes);

    }

    public enum Size{

        Familiar,
        Mediana

    }


}
