package Examen_2122;


import java.util.Comparator;

public class ComparaPuntos implements Comparator {

    public int compare(Object o1, Object o2) {

        AgrupacionOficial that1 = (AgrupacionOficial) o1;
        AgrupacionOficial that2 = (AgrupacionOficial) o2;


        int resultado = that1.puntos-that2.puntos;
        return resultado;

    }

}
