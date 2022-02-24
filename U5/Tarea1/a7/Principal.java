package Tarea1.a7;

import Tarea1.a1.Hora;
import Tarea1.a1.Hora12;
import Tarea1.a1.HoraExacta;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Caja c1 = new Caja(10,8,12, Caja.Unidades.CM);

        CajaCarton ca1 = new CajaCarton(14,20,8);

        CajaCarton ca2 = new CajaCarton(14,20,8);

        c1.etiqueta = "Av de bormujos";

        ca1.etiqueta = 123456;

        System.out.println(c1.toString());


        System.out.println(ca1.toString());

        System.out.println(ca2.toString());

    }


}
