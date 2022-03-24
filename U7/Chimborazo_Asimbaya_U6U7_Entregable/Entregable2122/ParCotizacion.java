package Entregable2122;

import java.io.*;

public class ParCotizacion implements Serializable {



    private Divisa divisaBase;
    private Divisa divisaCotizada;

    private int precioPar;
    private int variacion;

    public ParCotizacion(Divisa divisaBase, Divisa divisaCotizada, int precioPar, int variacion){

        this.divisaBase = divisaBase;
        this.divisaCotizada = divisaCotizada;
        this.precioPar = precioPar;
        this.variacion = variacion;

    }



    public Divisa getDivisaBase() {
        return divisaBase;
    }

    public void setDivisaBase(Divisa divisaBase) {
        this.divisaBase = divisaBase;
    }

    public Divisa getDivisaCotizada() {
        return divisaCotizada;
    }

    public void setDivisaCotizada(Divisa divisaCotizada) {
        this.divisaCotizada = divisaCotizada;
    }

    public int getPrecioPar() {
        return precioPar;
    }

    public void setPrecioPar(int precioPar) {
        this.precioPar = precioPar;
    }

    public int getVariacion() {
        return variacion;
    }

    public void setVariacion(int variacion) {
        this.variacion = variacion;
    }


}
