package metodos;

public class ObterMenor {
    float menor(float numero1, float numero2, float numero3) {
        if (numero1 < numero2 && numero1 < numero3) {
            return numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }

}
