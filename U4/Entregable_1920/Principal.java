package Entregable_1920;

import Entregable_1920.Pizzeria.Ingrediente;
import Entregable_1920.Pizzeria.Pedido;
import Entregable_1920.Pizzeria.Pizza;
import Entregable_1920.Pizzeria.Pizzeria;

public class Principal {

    public static void main(String[] args) {

        Ingrediente i1 = new Ingrediente();
        Ingrediente i2 = new Ingrediente("Pollo",500);
        Ingrediente i3 = new Ingrediente("pescado",150);
        Ingrediente i4 = new Ingrediente("Gambas",200);
        Ingrediente i5 = new Ingrediente("Tomate",120);

        Pizza p1 = new Pizza(i1);

        Pizza p2 = new Pizza(Pizza.Size.Mediana,i2);

        Pizza.mostrarTamanyos();

        p1.agregarIngrediente(i2);
        p1.agregarIngrediente(i3);

        p1.cantidadIngredientes();

        p1.mostrarInformacion();


        Pedido ped1 = new Pedido(p1);
        Pedido ped2 = new Pedido(p2);

        //ped1.mostrarPedido();
        //ped2.mostrarPedido();


        Pizzeria piz1 = new Pizzeria();
        Pizzeria piz2 = new Pizzeria();

        piz1.agregarPedido(ped1);
        piz1.agregarPedido(ped2);

        piz1.mostrarPedidos();


    }


}
