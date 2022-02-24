package Entregable_2122;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {


    private String creador_serie;
    private int num_temporadas;
    private String[] capitulos;
    private int num_capitulos;



    public Serie(String titulo, int anio_publicacion, String creador_serie, int num_temporadas){

        super(titulo,anio_publicacion);

        this.creador_serie = creador_serie;
        this.num_temporadas = num_temporadas;
        this.capitulos = new String[0];
        this.num_capitulos = 0;

    }



    public void add_capitulo(String capitulo) {

        if (num_capitulos < this.capitulos.length) {

            this.capitulos[num_capitulos] = capitulo;

        }else if (num_capitulos >= this.capitulos.length) {


            this.capitulos = Arrays.copyOf(this.capitulos, this.capitulos.length + 1);

            this.capitulos[num_capitulos] = capitulo;


        }

        num_capitulos++;

    }


    public boolean eliminar_capitulo(String capitulo) {

        boolean resultado = true;

        for (int i = 0; i < capitulos.length; i++) {

            if (capitulo.equals(capitulos[i])){


                resultado = false;

            }

        }
        return resultado;

    }



    @Override
    public void dar_por_finalizado(){
        System.out.println("Se ha marcado como finalizado: " + this.titulo);
    }

    @Override
    public void play(){
        System.out.println("Reproduciendo serie: " + this.titulo + ", Capitulo: " + capitulos[(int)(Math.random()*capitulos.length)]);

    }
    @Override
    public void pause(){
        System.out.println("Pausando serie: " + this.titulo + ", Capitulo: " + capitulos[(int)(Math.random()*capitulos.length)]);

    }
    @Override
    public void stop(){
        System.out.println("Parando serie: " + this.titulo + ", Capitulo: " + capitulos[(int)(Math.random()*capitulos.length)]);

    }


    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " , Creador de la serie: " +
                creador_serie + " , ";

        for (int i = 0; i < capitulos.length; i++) {
            resultado += "  -Capitulo "+ i + " :" + capitulos[i] ;
        }

        return resultado;
    }



    public String getCreador_serie(){

        return  creador_serie;

    }

    public String[] getCapitulos(){

        return  capitulos;

    }


    public void setCreador_serie(String creador_serie){

        this.creador_serie = creador_serie;

    }

    public void getCapitulos(String[] capitulos){

        this.capitulos = capitulos;

    }

}
