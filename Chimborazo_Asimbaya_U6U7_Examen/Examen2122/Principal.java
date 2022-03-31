package Examen2122;


import Entregable2021.Unidad;

import java.io.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) {



        Filmaffinity f1 = new Filmaffinity();
        Actor a1 = new Actor("ricardo","Gomez","Español");
        Actor a2 = new Actor("daniel","perez","Español");
        Actor a3 = new Actor("Jose","Lopez","Español");
        Actor a4 = new Actor("Enrique","Lorenzo","Español");
        Actor a5 = new Actor("Manuel","Carmen","Español");

        Pelicula p1 = new Pelicula("lejos",2022,"EEUU","Terror","Fernando Lugo");
        Pelicula p2 = new Pelicula("cerca",2021,"EEUU","Terror","Fernando Lugo");
        Pelicula p3 = new Pelicula("medio",2020,"EEUU","Terror","Fernando Lugo");
        Pelicula p4 = new Pelicula("Agua",2019,"EEUU","Terror","Fernando Lugo");
        Pelicula p5 = new Pelicula("Fuego",2018,"EEUU","Terror","Fernando Lugo");


        f1.addPeliculaActor(p1,a1);
        f1.addPeliculaActor(p1,a2);
        f1.addPeliculaActor(p3,a3);



       System.out.println("Resultado de lejos: " + f1.getPelicula("lejos"));


        //System.out.println("Pelicula: " + f1.getPelicula("lejos"));

    }

}
