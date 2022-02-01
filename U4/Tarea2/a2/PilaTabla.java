package Tarea2.a2;

import Tarea2.a1.Lista;

import java.util.Arrays;

public class PilaTabla {

    private Integer [] tabla;

    private int tamañoInicial;


    PilaTabla(){

        this.tabla = new Integer[10];

    }



    public int numPila (){

        int cont = 0;

        for (int i = 0; i < tabla.length; i++) {

            if (tabla[i]!=null){

                cont++;

            }

        }
        return cont;

    }


    public void Apilar (int num){
        if (numPila() < tabla.length){

            for (int i = numPila(); i > 0 ; i--) {
                tabla[i] = tabla [i-1] ;
            }
            tabla[0] = num;


        }else if (numPila() >= tabla.length){
            tabla = Arrays.copyOf(tabla,tabla.length+1);

            for (int i = numPila(); i > 0 ; i--) {
                tabla[i] = tabla [i-1] ;
            }
            tabla[0] = num;
        }


    }



    public void desapilar (){

        tabla[numPila()-1] = null;
        tabla = Arrays.copyOf(tabla,tabla.length-1);

    }


    public void cima (){

        System.out.println(tabla[numPila()-1]);

    }


    public void verPila () {

        System.out.println(Arrays.toString(tabla));

    }



}
