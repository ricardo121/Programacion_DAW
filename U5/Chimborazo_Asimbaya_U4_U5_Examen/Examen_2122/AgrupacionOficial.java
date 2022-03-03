package Examen_2122;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {

    protected int puntos;
    protected Integrante[] integrantes;
    protected int numIntegrantes;

    public AgrupacionOficial(String nombre, String autor, String autor_musica, String autor_letra, String tipo, int puntos){

        super(nombre,autor,autor_musica,autor_letra,tipo);
        this.puntos = puntos;
        this.integrantes = new Integrante[0];
        this.numIntegrantes = 0;

    }

    public void insertar_integrante(Integrante i){

        if (numIntegrantes < this.integrantes.length) {

            this.integrantes[numIntegrantes] = i;

        }else if (numIntegrantes >= this.integrantes.length) {


            this.integrantes = Arrays.copyOf(this.integrantes, this.integrantes.length + 1);

            this.integrantes[numIntegrantes] = i;


        }

        numIntegrantes++;

    }

    public boolean eliminar_integrante(Integrante i){

        boolean resultado = true;

        return resultado;

    }

    public abstract void caminito_del_falla();


    public int getPuntos(){
        return  puntos;
    }
    public Integrante[] getIntegrantes(){
        return  integrantes;
    }
    public int getNumIntegrantes(){
        return  numIntegrantes;
    }


    public void setPuntos( int puntos){
        this.puntos = puntos;
    }
    public void setIntegrantes( Integrante[] i){
        this.integrantes = i;
    }
    public void setNumIntegrantes(int numIntegrantes){
        this.numIntegrantes = numIntegrantes;
    }


    @Override
    public abstract void cantar_la_presentacion();

    @Override
    public abstract void hacer_tipo();

    @Override
    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " ,Puntos: " + puntos;

        return resultado;
    }


}
