package Tarea1.a9;

import java.util.Comparator;

public class ComparaPrecio {


    public int compare(Object o1, Object o2) {

        Lavadora that1 = (Lavadora) o1;
        Lavadora that2 = (Lavadora) o2;


        int resultado = (int) Math.round(that1.precioBase-that2.precioBase);
        return resultado;

    }
}
