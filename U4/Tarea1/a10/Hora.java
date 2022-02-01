package Tarea1.a10;

import java.util.Scanner;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;


    Hora(int hora, int minuto, int segundo){

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }


    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int horas){

        this.hora +=  horas;

    }

    public void setMinuto(int minutos){

        this.minuto = minutos % 60;

        int horas = minutos / 60;
        setHora(horas);

    }

    public void setSegundo(int segundos){

        this.segundo = segundos % 60;

        int minutos = segundos/60 ;
        setMinuto(minutos);

    }


}
