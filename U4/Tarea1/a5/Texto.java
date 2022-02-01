package Tarea1.a5;

import java.util.Scanner;

public class Texto {


    int max_longitud;
    String cadena;
    static final String vocal = "aeiouáeiou";

    Texto(int max_longitud) {

        cadena = "";
        this.max_longitud = max_longitud;

    }


    public void addChartP(char cad) {

        if (max_longitud > cadena.length()){

            cadena = cad + cadena ;

        }

    }

    public void addChartF(char cad) {

        if (max_longitud > cadena.length()){

            cadena = cadena + cad ;

        }

    }




    void addStringP(String c){

        if (max_longitud >= cadena.length() + c.length()){

            cadena = c + cadena;

        }

    }


    void addStringF(String c){

        if (max_longitud >= cadena.length() + c.length()){

            cadena = cadena + c;

        }

    }



    void mostrarInformacion(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cadena: "+ cadena);
    }


    void numVocal(){

        int cont = 0;

        //if ()

    }

}
