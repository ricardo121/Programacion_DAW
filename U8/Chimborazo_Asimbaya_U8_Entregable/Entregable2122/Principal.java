package Entregable2122;

public class Principal {


    public static void main(String[] args) {

        ProcessPosts p1 = new ProcessPosts();

        final String xmlfile = "C:\\Users\\Ricardo\\IdeaProjects\\U8\\src\\Entregable2122\\peliculas.xml";
        p1.parseDOM(xmlfile);

        //p1.numNodosHijos();
        //p1.mostrarXMLDom();
        

    }



}
