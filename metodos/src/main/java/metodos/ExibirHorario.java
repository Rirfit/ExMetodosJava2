package metodos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExibirHorario {
    public void exibirHora(){
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(horaAtual.format(horaFormatada));
    }
   

}
