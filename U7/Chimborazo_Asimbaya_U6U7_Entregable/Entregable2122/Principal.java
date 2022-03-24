package Entregable2122;

public class Principal {


    public static void main(String[] args) {
        //
        Exchange e1 = new Exchange();
        Criptomoneda c1 = new Criptomoneda("nombre", "$",5,6,"16 de Diciembre");
        Fiat f1 = new Fiat("nombre2","%","Peru");
        Criptomoneda c2 = new Criptomoneda("noe", "$",5,6,"17 de Diciembre");
        Fiat f2 = new Fiat("noe2","%","Peru");
        Criptomoneda c3 = new Criptomoneda("n2", "$",5,6,"16 de Diciembre");
        Fiat f3 = new Fiat("n3","%","Peru");
        ParCotizacion p1 = new ParCotizacion(f1,c1,20,30);
        ParCotizacion p2 = new ParCotizacion(f2,c2,40,60);

        ParCotizacion p3 = new ParCotizacion(f3,c3,40,60);

        e1.addCotizacion(p1);
        e1.addCotizacion(p2);
        e1.mostrarDivisasOrdenadas();

    }

}
