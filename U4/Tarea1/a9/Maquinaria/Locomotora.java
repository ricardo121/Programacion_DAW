package Tarea1.a9.Maquinaria;

import Tarea1.a9.Personal.Mecanico;

import java.util.Scanner;

public class Locomotora {

    private String matricula;
    private String añoFabricacion;
    private int motor;

    Mecanico mecanico;


    public Locomotora(String matricula, int motor, String añoFabricacion, Mecanico mecanico){

        this.matricula = matricula;
        this.motor = motor;
        this.añoFabricacion = añoFabricacion;
        this.mecanico = mecanico;

    }



    void estado(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Estado de Bombilla : encendido "  );

        System.out.println("Estado de Bombilla : apagado " );

        System.out.println("\n");

    }
}
