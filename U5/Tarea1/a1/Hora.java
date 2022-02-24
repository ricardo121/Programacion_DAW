package Tarea1.a1;


public class Hora {

    public int hora;
    public int minuto;

    public Hora(int hora, int minuto){

        setHoras(hora);
        setMinutos(minuto);

    }


    public  void inc(){
        minuto++;

        if (minuto > 59){
            hora = hora + 1;
            minuto = 0;
        }

    }


    public  void setHoras(int valor){

        if (valor>0 && valor<24){
            hora = valor;
        }


    }


    public  void setMinutos(int valor){

        if (valor>0 && valor<60){
            minuto = valor;
        }

    }


    public  int getMinutos(int valor){

        if (valor>0 && valor<24){
            return valor;
        }else{
            return valor;
        }


    }


    public String toString(){

        String resultado = "";

        resultado = hora + ":" + minuto ;


        return resultado;
    }

}
