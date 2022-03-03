package Examen_2122;


import Tarea1.a9.Electrodomestico;
import Tarea1.a9.Lavadora;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Agrupacion[] tabla1 = new Agrupacion[4];


        tabla1[0] = new Coro("los del rio","manolo","manolo","pepe1","Mediaval",50,4,3);
        tabla1[1] = new Coro("los del mar","diego","diego","pepe2","Arabe",20,1,2);
        tabla1[2] = new Coro("los","fran","fran","pepe3","Indio",30,10,5);
        tabla1[3] = new Cuarteto("los pepe","edison","edison","pepe4","Mexicano",10,6);



        AgrupacionOficial[] tabla2 = new AgrupacionOficial[3];





        tabla2[0] = new Coro("los del rio","manolo","manolo","pepe1","Mediaval",50,4,3);
        tabla2[1] = new Coro("los del mar","diego","diego","pepe2","Arabe",20,1,2);
        tabla2[2] = new Cuarteto("los pepe","edison","edison","pepe4","Mexicano",10,6);



        Arrays.sort(tabla2, new ComparaAutor());

        System.out.println("Tabla: " + Arrays.toString(tabla2));

        Arrays.sort(tabla2, new ComparaPuntos());

        System.out.println("Tabla: " + Arrays.toString(tabla2));


        tabla2[1].caminito_del_falla();
        tabla2[2].cantar_la_presentacion();
        tabla2[1].hacer_tipo();

        Integrante i1 = new Integrante("pedro", 20,"sevilla",1);

        tabla2[2].insertar_integrante(i1);

        Cuarteto c1 = new Cuarteto("los pepe","edison","edison","pepe4","Mexicano",10,6);


        Agrupacion c2 = new Coro("los del mar","diego","diego","pepe","Arabe",20,1,2);





        Arrays.sort(tabla1);

        System.out.println("Tabla: " + Arrays.toString(tabla1));

        c1.amo_a_escucha();
        tabla1[1].cantar_la_presentacion();


        Arrays.sort(tabla1, new ComparaPuntos());

        System.out.println("Tabla: " + Arrays.toString(tabla1));

        System.out.println("Numero de Agrupaciones" + Agrupacion.contAgrupaciones);


    }

}
