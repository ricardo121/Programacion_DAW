package Tarea1.a1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Hora h1 = new Hora(7,58);

        System.out.println(h1.toString());

        h1.inc();

        System.out.println(h1.toString());

        h1.inc();

        System.out.println(h1.toString());
        h1.inc();

        System.out.println(h1.toString());

        Hora12 ho1 = new Hora12(13,54, Hora12.Meriadiano.AM);

        System.out.println(ho1.toString());

        ho1.setHoras(11);

        ho1.setHoras(6);

        ho1.inc();

        ho1.inc();
        ho1.inc();
        ho1.inc();
        ho1.inc();

        System.out.println(ho1.toString());

        HoraExacta hora1 = new HoraExacta(23,58,58 );

        hora1.inc();
        HoraExacta hora2 = new HoraExacta(23,59,59 );
        System.out.println(hora1.toString());



        System.out.println(hora1.toString());
        System.out.println(hora2.toString());

        System.out.println(hora1.comparar(hora2));

        System.out.println(hora1.toString());

    }

}
