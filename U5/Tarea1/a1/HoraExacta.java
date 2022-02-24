package Tarea1.a1;

public class HoraExacta extends Hora {

    public int segundo;

    public HoraExacta(int hora, int minuto, int segundo){

        super(hora, minuto);
        setHoras(hora);
        setSegundos(segundo);

    }



    public  void setSegundos(int valor){

        if (valor>0 && valor<60){
            segundo = valor;
        }

    }

    public  void inc(){

        if (segundo < 59){
            segundo = segundo + 1;
        }else{
            segundo = 0;
            minuto = minuto +1;
        }
        if (minuto < 59){
            minuto = minuto +1;
        }else {
            minuto = 0;
            hora = hora +1;
        }

    }



    public boolean comparar(Object O){

        boolean resultado;
        HoraExacta otrahora = (HoraExacta) O;


        if (this.hora == otrahora.hora && this.minuto == otrahora.minuto && this.segundo == otrahora.segundo ){
            resultado = true;
        }else{
            resultado = false;
        }

        return resultado;
    }




    @Override
    public String toString(){

        String resultado = "";

        resultado = hora + ":" + minuto + ":"+ segundo ;

        return resultado;
    }

}
