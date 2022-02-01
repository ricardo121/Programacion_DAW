package Tarea1.a8;

import java.util.Scanner;

public class Bombilla {


    static boolean interruptorGeneral = true;

    private boolean interruptor;


    public Bombilla(){

        this.interruptor = false;

    }

    public boolean estado(){

        boolean estado;

        if (interruptor == true && interruptorGeneral == true){
             return estado = true;
        }else{
             return estado = false;
        }

    }

    void apagar(){

        interruptor= false;

    }

    void encender(){

        interruptor = true;

    }

    void estadoBombilla(){

        Scanner teclado = new Scanner(System.in);

        if (estado()){
            System.out.println("Estado de Bombilla : encendido "  );
        }else{
            System.out.println("Estado de Bombilla : apagado " );
        }

        System.out.println("\n");

    }

}
