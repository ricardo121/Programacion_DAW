package Tarea1.a9;

import Tarea2.a2.Cliente;

public class Lavadora extends Electrodomestico implements Comparable {

    public int carga;

    public Lavadora(){

        super();
        this.carga = 5;

    }

    public Lavadora(double precioBase, int peso){

        super(precioBase,peso);
        this.carga = 5;

    }


    public Lavadora(Electrodomestico.Color color, Electrodomestico.ConsumoEnergetico consumoenergetico, double precioBase, int peso, int carga ){

        super(color, consumoenergetico, precioBase, peso);
        this.carga = carga;
    }

    @Override
    public double getPrecioFinal(){

        if (carga > 30){
            precioFinal += 50;
        }

        return  precioFinal;

    }


    public int getCarga(){

        return  carga;

    }

    public int compareTo(Object o) {

        Lavadora that = (Lavadora) o;

        return carga - that.carga;

    }

}
