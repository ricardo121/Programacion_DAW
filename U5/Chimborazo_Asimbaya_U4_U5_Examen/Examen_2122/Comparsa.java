package Examen_2122;

public class Comparsa extends AgrupacionOficial  {

    private String empresaAtrezzo;


    public Comparsa(String nombre, String autor, String autor_musica, String autor_letra, String tipo, int puntos, String empresaAtrezzo){
        super(nombre,autor,autor_musica,autor_letra,tipo,puntos);
        this.empresaAtrezzo = empresaAtrezzo;

    }


    public String getEmpresaAtrezzo(){
        return  empresaAtrezzo;
    }


    public void setEmpresaAtrezzo( String empresaAtrezzo){
        this.empresaAtrezzo = empresaAtrezzo;
    }


    @Override
    public void cantar_la_presentacion(){
        System.out.println("Cantando la presentación de la Comparsa con nombre " + nombre);
    }

    @Override
    public void hacer_tipo(){
        System.out.println("La Comparsa " + nombre + " va de " + tipo);
    }


    public void caminito_del_falla(){
        System.out.println("La Comparsa " + nombre + " va caminito del falla");
    }


    @Override
    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " ,Empresa de Atrezzos: " + empresaAtrezzo;

        return resultado;
    }

}
