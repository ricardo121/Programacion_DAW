package Tarea1.a9.Maquinaria;

import Tarea1.a9.Personal.Maquinista;

public class Tren {

    Vagon [] vagon;
    Locomotora locomotora;
    Maquinista maquinista;
    int numVagones;

    public Tren(Locomotora locomotora, Maquinista maquinista){

        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagon = new Vagon[3];
        this.numVagones = 0;
    }

    public void addVagon(int capacidadM, int capacidadA, String mercancia){

        if (numVagones < vagon.length){
            vagon[numVagones] = new Vagon(capacidadM,capacidadA,mercancia);
            numVagones++;
        }else{
            System.out.println("Solo se pueden introducir 5 Vagones" );
        }

    }

}
