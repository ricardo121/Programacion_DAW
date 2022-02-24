package Tarea1.a7;

public class CajaCarton extends Caja {

    public double area;

    public double areaTotal = 0;

    int etiqueta;

    public CajaCarton(double ancho, double alto, double fondo){

        super(ancho, alto, fondo,Unidades.CM);

        area = 2 * (ancho * alto + ancho * fondo + alto * fondo );

        areaTotal += area;
    }

    @Override
    public double getVolumen(){

        return volumen * 0.8;

    }


    public double getArea(){

        return area;

    }

    @Override
    public String toString(){

        String resultado = "";

        resultado = ancho + " / " + alto + " / " + fondo + " / " + etiqueta + " / Area:  " + area + "  Area Total:"+ areaTotal;

        return resultado;

    }

}
