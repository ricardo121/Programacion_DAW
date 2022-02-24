package Entregable_2122;

public class Libro extends Multimedia {


    private String autor;
    private String editorial;
    private String identificador;
    private int num_paginas;


    public Libro(String titulo, int año_publicacion, String autor, String editorial, String identificador, int num_paginas){

        super(titulo,año_publicacion);

        this.autor = autor;
        this.editorial = editorial;
        this.identificador = identificador;
        this.num_paginas = num_paginas;

    }

    @Override
    public void dar_por_finalizado(){
        System.out.println("Se ha marcado como finalizado: " + this.titulo);
    }


    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " , Autor: " + autor +
                " , Editorial: " + editorial + " , Identificador ISBN: " + identificador + ", Numero de paginas: "+  num_paginas;

        return resultado;
    }

    public String getAutor(){

        return  autor;

    }

    public String getEditorial(){

        return  editorial;

    }

    public String getIdentificador(){

        return  identificador;

    }

    public int getNum_paginas(){

        return  num_paginas;

    }

    public void setAutor(){

        this.autor = autor;

    }

    public void setEditorial(){

        this.editorial = editorial;

    }

    public void setIdentificador(){

        this.identificador = identificador;

    }

    public void setNum_paginas(){

        this.num_paginas = num_paginas;

    }

}
