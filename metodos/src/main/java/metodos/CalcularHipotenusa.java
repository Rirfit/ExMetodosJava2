package metodos;

public class CalcularHipotenusa {
    double hipotenusa (double cateto1, double cateto2){
        double H = (cateto1 * cateto1) + (cateto2 * cateto2);
        return Math.sqrt(H);
    }

}
