public class Time {
    private int hora, minuto, segundo;

    public void setHora(int hora){
        if(hora >= 0 && hora <= 23){
            this.hora = hora;
        }else{
            System.out.println("Hora inválida!");
        }
    }

    public int getHora(){
        return hora;    
    }

    public void setMinuto(int minuto){
        if(minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        }else{
            System.out.println("Minutos inválidos!");
        }
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public void setSegundo(int segundo){
        if(segundo >= 0 && minuto <= 59){
            this.segundo = segundo;
        }else{
            System.out.println("Segundos inválidos!");
        }
    }

    public int getSegundo(){
        return segundo;
    }

    public String vizualizarHoraUniversal(){
        return(hora + ":" + minuto + ":" + segundo);
    }

    /* public String vizualizarHoraAmPm(){
        String periodo;
        if(hora > 12){
            hora = hora - 12;
            periodo = "PM";
        }else if(hora == 12){
            hora = 12;
            periodo = "PM";
        }else if(hora == 0){
            hora = 00;
            periodo = "AM";
        }
    }
*/

}
