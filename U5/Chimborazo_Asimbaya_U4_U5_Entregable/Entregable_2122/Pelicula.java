package Entregable_2122;

import java.util.Arrays;

public class Pelicula extends Multimedia implements Reproducible {


    private String director;
    private int duracion;
    private String productora;
    private String pais;


    public Pelicula(String titulo, int anio_publicacion, String director, int duracion, String productora, String pais){

        super(titulo,anio_publicacion);

        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;

    }



    @Override
    public void dar_por_finalizado(){
        System.out.println("Se ha marcado como finalizado: " + this.titulo);
    }

    @Override
    public void play(){
        System.out.println("Reproduciendo película: " + this.titulo);

    }
    @Override
    public void pause(){
        System.out.println("Pausando película: " + this.titulo);

    }
    @Override
    public void stop(){
        System.out.println("Parando película: " + this.titulo);

    }

    @Override
    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " , Director: " + director +
                " , Duracion: " + duracion + " , Productora: " + productora + " , Pais: " + pais ;

        return resultado;
    }

    public String getDirector(){

        return  director;

    }

    public int getDuracion(){

        return  duracion;

    }

    public String getProductora(){

        return  productora;

    }

    public String getPais(){

        return  pais;

    }


    public void setDirector(){

        this.director = director;

    }

    public void setDuracion(){

        this.duracion = duracion;

    }

    public void setProductora(){

        this.productora = productora;

    }

    public void setPais(){

        this.pais = pais;

    }

}
