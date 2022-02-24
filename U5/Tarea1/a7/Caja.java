package Tarea1.a7;

import Tarea1.a5.Instrumento;

public class Caja {

    protected  double ancho;
    protected double alto;
    protected double fondo;
    public String etiqueta;
    public double volumen;


    public Unidades u;

    public Caja(double ancho, double alto, double fondo, Unidades u){

        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;

        if (u == Unidades.CM){
            volumen = (ancho/100) * (alto/100) * (fondo/100);
        }else if (u == Unidades.M){
            volumen = ancho * alto * fondo;
        }

    }


    public double getVolumen(){

        return volumen;

    }


    public String toString(){

        String resultado = "";

        resultado = ancho + " / " + alto + " / " + fondo + " / " + etiqueta ;

        return resultado;

    }

    public enum Unidades{
        M,
        CM
    }

}
