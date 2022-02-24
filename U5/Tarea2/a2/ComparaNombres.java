package Tarea2.a2;

import java.util.Comparator;


public class ComparaNombres implements Comparator {


        @Override
        public int compare(Object o1, Object o2) {

            Cliente that1 = (Cliente) o1;
            Cliente that2 = (Cliente) o2;
            return that1.nombre.compareTo(that2.nombre);

        }

}
