package Entregable_2122;


public class Principal {


    public static void main(String[] args) {

        Material m1 = new Material("Madera","Manolo",30,100);
        Material m2 = new Material("Ladrillo",10001,100);
        Material m3 = new Material("Piedra",100,100);

        ManoDeObra mano1 = new ManoDeObra("Carpinteros","Carpintero",10,10);
        ManoDeObra mano2 = new ManoDeObra("Albañiles","Albañiles",5,20);
        ManoDeObra mano3 = new ManoDeObra("Fontaneros","Fontaneros",12,5);

        Vivienda v1 = new Vivienda("Bormujos",100);
        Vivienda v2 = new Vivienda("Gines",200);
        Vivienda v3 = new Vivienda("Tomares",300);


        Obra o1 = new Obra(v1,mano1, Vivienda.Estancia.SALÓN);
        Obra o2 = new Obra(v1,mano2, Vivienda.Estancia.VESTÍBULO);
        Obra o3 = new Obra(v2,mano3, Vivienda.Estancia.SALÓN);



        Material.mostrarIVA();
        Material.cambiarIVA(13.5);
        Material.mostrarIVA();



        v1.insertarInstancia(Vivienda.Estancia.BAÑO);
        v1.insertarInstancia(Vivienda.Estancia.BALCÓN);
        v1.insertarInstancia(Vivienda.Estancia.BAÑO);

        v2.insertarInstancia(Vivienda.Estancia.SALÓN);
        v2.insertarInstancia(Vivienda.Estancia.VESTÍBULO);
        v2.insertarInstancia(Vivienda.Estancia.VESTÍBULO);
        v2.eliminarEstancia(1);

        m1.mostrarInformacion();
        mano1.mostrarInformacion();
        v1.mostrarInformacion();
        o1.mostrarInformacion();


        System.out.println("MOstrar estnacias:");
        Vivienda.mostrarEstancias();
    }

}
