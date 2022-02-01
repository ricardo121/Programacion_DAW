package Tarea2.a1;

import java.util.Arrays;

public class Lista {

    private Integer [] tabla;

    private int tamañoInicial;


    Lista(){

        this.tabla = new Integer[10];

    }

    Lista(int tamañoInicial){

        this.tabla = new Integer[tamañoInicial];

    }


    public int numLista (){

        int cont = 0;

        for (int i = 0; i < tabla.length; i++) {

            if (tabla[i]!=null){

                cont++;

            }

        }
        return cont;

    }

    public void insertarP (int num){
        if (numLista() < tabla.length){

            for (int i = numLista(); i > 0 ; i--) {
                tabla[i] = tabla [i-1] ;
            }
            tabla[0] = num;


        }else if (numLista() >= tabla.length){
            tabla = Arrays.copyOf(tabla,tabla.length+1);

            for (int i = numLista(); i > 0 ; i--) {
                tabla[i] = tabla [i-1] ;
            }
            tabla[0] = num;
        }


    }

    public void insertarF (int num){
        if (numLista() < tabla.length) {

            tabla[numLista()] = num;

        }else if (numLista() >= tabla.length){
            tabla = Arrays.copyOf(tabla,tabla.length+1);

            tabla[numLista()] = num;
        }
    }

    public void insertarEspecifico (int num, int indice){
        tabla[indice]= num;
    }


    public void unirListas (Lista list1){

        Integer resultado [] = new Integer [numLista() + list1.numLista()];
        int cont = 0;

        for (int i = 0; i < numLista(); i++) {

            resultado[cont]= tabla[i];
            cont++;
        }

        for (int i = 0; i < list1.numLista(); i++) {

            resultado[cont]= list1.tabla[i];
            cont++;
        }

        tabla = Arrays.copyOf(resultado,resultado.length);

    }



    public void eliminarEspecifico (int indice){
        tabla[indice]= null;
    }


    public Integer obtenerEspecifico (int indice){

        Integer resultado = tabla[indice];

        return resultado;

    }


    public int buscarNumero (Integer num) {

        int indice = -1;

        for (int i = 0; i < tabla.length; i++) {

            if (num == tabla[i]) {

                indice = i;
                break;
            }

        }

        return indice;

    }

    public void verLista () {

        System.out.println(Arrays.toString(tabla));

    }

}
