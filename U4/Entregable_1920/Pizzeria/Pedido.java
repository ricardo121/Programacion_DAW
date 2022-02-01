package Entregable_1920.Pizzeria;

import java.text.DateFormat;
import java.util.Calendar;

public class Pedido {

    private Pizza pizza ;

    private Calendar momento = Calendar.getInstance();

    private int dia ;
    private int mes ;
    private int anio ;


    public Pedido(Pizza pizza){

        this.pizza = pizza;
        this.dia = momento.get(Calendar.DATE);
        this.mes = momento.get(Calendar.MONTH)+1;
        this.anio = momento.get(Calendar.YEAR);

    }



    public Pedido(){

        Ingrediente i1 = new Ingrediente("Jamon-Iberico",500);
        Ingrediente i2 = new Ingrediente();
        pizza = new Pizza(Pizza.Size.Familiar,i1);
        pizza.agregarIngrediente(i2);

        this.dia = momento.get(Calendar.DATE);
        this.mes = momento.get(Calendar.MONTH)+1;
        this.anio = momento.get(Calendar.YEAR);

    }


    public void mostrarPedido(){

        System.out.println("Dia: ");
        System.out.println("Dia: "+ dia + " , Mes: "+ mes + " , Año:" + anio);

    }




}
