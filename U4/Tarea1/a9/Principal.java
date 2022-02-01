package Tarea1.a9;

import Tarea1.a9.Maquinaria.Locomotora;
import Tarea1.a9.Maquinaria.Tren;
import Tarea1.a9.Personal.Maquinista;
import Tarea1.a9.Personal.Mecanico;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Mecanico m1 = new Mecanico("ricardo","67876533L",678987676,Mecanico.especialista.Frenos);

        Maquinista maq1 = new Maquinista("diego","78657687M",1000,"Alto");

        Locomotora l1 = new Locomotora("78987656K",500,"5/6/1998",m1);

        Tren t1 = new Tren(l1,maq1);

        t1.addVagon(100,50,"arroz");
        t1.addVagon(100,50,"arroz");
        t1.addVagon(100,50,"arroz");
        t1.addVagon(100,50,"arroz");

    }

}
