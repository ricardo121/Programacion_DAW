package Entregable2122;

public class Fiat extends Divisa {


    private String pais;


    public Fiat(String nombre, String simbolo, String pais){

        super(nombre,simbolo);
        this.pais = pais;

    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        return super.toString() + " pais: " + pais;
    }


}
