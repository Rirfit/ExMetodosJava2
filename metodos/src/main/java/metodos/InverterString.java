package metodos;

public class InverterString {
    String inverter (String texto){
        StringBuilder stringBuilder = new StringBuilder(texto);
        return stringBuilder.reverse().toString();

    }

}
