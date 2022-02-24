package Tarea1.a1;

public class Hora12  extends Hora{

    private Meriadiano meriadiano;

    public Hora12(int hora, int minuto, Meriadiano meriadiano){

        super(hora, minuto);
        setHoras(hora);
        this.meriadiano = meriadiano;

    }


    @Override
    public  void inc(){

        super.inc();

        if (hora>=12){
            hora = 1;
            if (meriadiano==Meriadiano.AM){
                meriadiano = Meriadiano.PM;
            }else{
                meriadiano = Meriadiano.AM;
            }
        }

    }


    @Override
    public  void setHoras(int valor){

        if (1 <= valor && valor <12){
            this.hora = valor;
        }

    }


    @Override
    public String toString(){

        String resultado = "";

        resultado = hora + ":" + minuto + " "+ meriadiano ;

        return resultado;
    }


    public enum Meriadiano{
        AM,
        PM
    }

}
