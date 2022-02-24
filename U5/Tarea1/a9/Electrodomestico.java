package Tarea1.a9;

import Tarea1.a7.Caja;

public class Electrodomestico {

    protected double precioBase;
    protected int peso;
    protected ConsumoEnergetico consumoenergetico;
    protected Color color;

    protected double precioFinal;

    public Electrodomestico(){

        this.color = Color.Blanco;
        this.consumoenergetico = ConsumoEnergetico.F;
        this.precioBase = 100;
        this.peso = 5;


    }

    public Electrodomestico(double precioBase, int peso){

        this.color = Color.Blanco;
        this.consumoenergetico = ConsumoEnergetico.F;
        this.precioBase = precioBase;
        this.peso = peso;


    }


    public Electrodomestico(Color color, ConsumoEnergetico consumoenergetico, double precioBase, int peso ){

        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.precioBase = precioBase;
        this.peso = peso;


    }


    public double getPrecioFinal(){


        if (consumoenergetico == ConsumoEnergetico.A){
            precioFinal += 100;
        }else if(consumoenergetico == ConsumoEnergetico.B) {
            precioFinal += 80;
        }else if(consumoenergetico == ConsumoEnergetico.C) {
            precioFinal += 60;
        }else if(consumoenergetico == ConsumoEnergetico.D) {
            precioFinal += 50;
        }else if(consumoenergetico == ConsumoEnergetico.E) {
            precioFinal+= 30;
        }else if(consumoenergetico == ConsumoEnergetico.F) {
            precioFinal += 10;
        }

        if (peso > 0 && peso < 29){
            precioFinal += 10;
        }else if(peso > 39 && peso < 49) {
            precioFinal += 60;
        }else if(peso > 49 && peso < 79) {
            precioFinal += 80;
        }else if(peso >= 80 ){
            precioFinal += 100;
        }

        precioFinal += precioBase;

        return precioFinal;

    }


    public double getPrecioBase(){

        return precioBase;

    }

    public int getPeso(){

        return peso;

    }

    public Color getColor(){

        return color;

    }

    public ConsumoEnergetico getConsumoEnergetico(){

        return consumoenergetico;

    }

    public String toString(){

        String resultado = "";

        resultado = "" ;

        return resultado;

    }


    public enum ConsumoEnergetico{

        A,
        B,
        C,
        D,
        E,
        F

    }


    public enum Color{

        Blanco,
        Negro,
        Rojo,
        Azul,
        Gris

    }


}
