package Examen_2122;

import Entregable_2122.Multimedia;

import java.util.Comparator;

public class ComparaAutor implements Comparator {

    public int compare(Object o1, Object o2) {

        Agrupacion that1 = (Agrupacion) o1;
        Agrupacion that2 = (Agrupacion) o2;


        return that1.autor.compareTo(that2.autor);

    }

}
