package Tarea1.a7;

import java.util.Scanner;

public class Emisora {

    private double frecuencia;
    private double salto = 0.5;


    public Emisora(){

        this.frecuencia = 80;

    }


    void subida(){


        if (frecuencia+salto > 108){
            frecuencia = 80;
        }else{
            frecuencia += salto;
        }


    }

    void bajada(){

        if (frecuencia-salto < 80){
            frecuencia = 108;
        }else{
            frecuencia -= salto;
        }

    }


    void display(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Frecuencia : " + frecuencia + "MHz");

        System.out.println("\n");
    }

}
