package Tarea2.a1;

import java.util.Arrays;

public class PilaTabla implements Pila {

    Integer tabla[];

    int numElementosTabla;

    public PilaTabla(){

        this.tabla = new Integer[10];
        this.numElementosTabla = 0;

    }


    public void apilar(Integer numero){

            tabla[numElementosTabla]= numero;
            numElementosTabla++;

    }


    public void desapilar(){

        tabla[numElementosTabla]= null;

    }

    public String toString(){

        String resultado = " ";

        for (int i = 0; i < numElementosTabla; i++) {
            resultado +=  tabla[i] + ", ";
        }

        return resultado;
    }

    public void mostrar(){

        System.out.println(Arrays.toString(tabla));
        System.out.println(numElementosTabla);


    }

}
