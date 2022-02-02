package Entregable_2122;

import Entregable_1920.Pizzeria.Ingrediente;
import Entregable_1920.Pizzeria.Pizza;

import java.util.Arrays;

public class Vivienda {

    private String direccion;
    private int metros ;
    private Estancia [] estancia;
    private int numEstancia;

    public Vivienda(String direccion, int metros){

        this.direccion = direccion;
        this.metros = metros;
        numEstancia = 0;
        this.estancia = new Estancia[0];


    }

    public int numLista (){

        int cont = 0;

        for (int i = 0; i < estancia.length; i++) {

            if (estancia[i]!=null){

                cont++;

            }

        }
        return cont;

    }


    public  void insertarInstancia(Estancia estancia){


        if (numLista() < this.estancia.length) {

            this.estancia[numLista()] = estancia;

        }else if (numLista() >= this.estancia.length){
            this.estancia = Arrays.copyOf(this.estancia,this.estancia.length+1);

            this.estancia[numLista()] = estancia;
        }


    }


    public void eliminarEstancia (int indice){
        this.estancia[indice]= null;
    }


    public enum Estancia{

        SALÓN,
        COCINA,
        BAÑO,
        DORMITORIO,
        TERRAZA,
        VESTÍBULO,
        COMEDOR,
        BALCÓN

    }


    public static void mostrarEstancias(){

        for (Estancia e : Estancia.values()) {
            System.out.println(e);
        }

    }



    public void mostrarInformacion(){

        System.out.println("VIVIENDA ");
        System.out.println("Direccion: " + direccion);
        System.out.println("Metros Cuadrados: " + metros);
        System.out.println(Arrays.toString(this.estancia));
        System.out.println("\n");
    }




}
