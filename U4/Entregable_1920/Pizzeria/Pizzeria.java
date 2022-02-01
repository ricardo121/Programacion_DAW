package Entregable_1920.Pizzeria;

public class Pizzeria {

    private Pedido [] pedido ;

    private int numPedidos;
    private int numIngredientes;
    private int capacidad;

    public Pizzeria(){

        numPedidos = 0;
        this.pedido= new Pedido[5];

    }

    public Pizzeria(int capacidad){

        numPedidos = 0;
        this.pedido= new Pedido[capacidad];

    }


    public void agregarPedido(Pedido pedido){

        if (numPedidos < this.pedido.length){

            this.pedido[numPedidos] =  pedido;
            //System.out.println("dato:" );
            //this.pedido[numPedidos].mostrarPedido();
            numPedidos++;


        }else{
            System.out.println("Solo se pueden introducir 3 Ingredientes" );
        }

    }


    public void mostrarPedidos(){

        System.out.println("Pizzeria: ");

        for (int i = 0; i < numPedidos; i++) {

            pedido[i].mostrarPedido();

        }

        System.out.println("\n");

    }


    public void cantidadPedidos(Pedido pedido){

        System.out.println("Cantidad de Pedidos: " + numPedidos );

    }




}
