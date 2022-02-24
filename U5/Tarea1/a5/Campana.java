package Tarea1.a5;

import java.util.Arrays;

public class Campana extends Instrumento {

    public Campana(){

        super();


    }


    @Override
    public void interpretar(){
        System.out.println("Notas del Piano:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i]==Notas.DO){
                System.out.println("DOOO");
            }else if (notas[i]==Notas.RE){
                System.out.println("REEE");
            }else if (notas[i]==Notas.MI){
                System.out.println("MIII");
            }else if (notas[i]==Notas.FA){
                System.out.println("FAAA");
            }else if (notas[i]==Notas.SOL){
                System.out.println("SOOOL");
            }else if (notas[i]==Notas.LA){
                System.out.println("LAAA");
            }else if (notas[i]==Notas.SI){
                System.out.println("SIII");
            }

        }

    }

}
