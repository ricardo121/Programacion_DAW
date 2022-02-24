package Tarea1.a5;

import Tarea1.a1.Hora;
import Tarea1.a1.Hora12;
import Tarea1.a1.HoraExacta;

import java.util.Scanner;

public class Principal {



    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Piano p1 = new Piano();

        p1.add(Instrumento.Notas.DO);
        p1.add(Instrumento.Notas.DO);
        p1.add(Instrumento.Notas.FA);
        p1.add(Instrumento.Notas.DO);

        p1.interpretar();



        Campana c1 = new Campana();

        c1.add(Instrumento.Notas.RE);
        c1.add(Instrumento.Notas.DO);
        c1.add(Instrumento.Notas.FA);
        c1.add(Instrumento.Notas.MI);

        c1.interpretar();

    }

}
