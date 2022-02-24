package Tarea1.a5;

import java.util.Arrays;

public class Piano extends Instrumento {

    public Piano(){

        super();


    }


    @Override
    public void interpretar(){
        System.out.println("Notas del Piano:");
        for (int i = 0; i < notas.length; i++) {

            if (notas[i]==Notas.DO){
                System.out.println("DO");
            }else if (notas[i]==Notas.RE){
                System.out.println("RE");
            }else if (notas[i]==Notas.MI){
                System.out.println("MI");
            }else if (notas[i]==Notas.FA){
                System.out.println("FA");
            }else if (notas[i]==Notas.SOL){
                System.out.println("SOL");
            }else if (notas[i]==Notas.LA){
                System.out.println("LA");
            }else if (notas[i]==Notas.SI){
                System.out.println("SI");
            }

        }
    }


}
