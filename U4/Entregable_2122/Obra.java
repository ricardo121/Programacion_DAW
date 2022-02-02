package Entregable_2122;

import java.util.Arrays;

public class Obra {

    private Vivienda vivienda;
    private Material [] material ;
    private ManoDeObra manoDeObra;
    private int numMaterial;

    public Obra(Vivienda vivienda, ManoDeObra manoDeObra, Vivienda.Estancia estancia){

        this.vivienda = vivienda;
        this.manoDeObra = manoDeObra;

        numMaterial = 0;
        this.material = new Material[0];


    }


    public int numLista (){

        int cont = 0;

        for (int i = 0; i < material.length; i++) {

            if (material[i]!=null){

                cont++;

            }

        }
        return cont;

    }


    public  void addMaterial(Material material){
        
        if (numLista() < this.material.length) {

            this.material[numLista()] = material;

        }else if (numLista() >= this.material.length){
            this.material = Arrays.copyOf(this.material,this.material.length+1);

            this.material[numLista()] = material;
        }


    }


    public void eliminarMaterial(int indice){
        this.material[indice]= null;
    }

    public void mostrarInformacion(){

        System.out.println("OBRA");
        vivienda.mostrarInformacion();
        manoDeObra.mostrarInformacion();
        System.out.println("Estancia: " );
        System.out.println("\n");
    }

}
