package Tarea1.a5;

import java.util.Arrays;

public abstract class Instrumento {


    protected Notas [] notas;
    protected int numNotas;

    public Instrumento(){

    this.notas = new Notas[100];
    this.numNotas = 0;

    }



    public  void add(Notas notas){


        if (numNotas < this.notas.length) {

            this.notas[numNotas] = notas;

        }
        numNotas++;
    }




    public enum Notas{

        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI

    }

    public abstract void interpretar();

}
