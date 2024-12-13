package metodos;

public class EhPrimo {
    String primo(float numero) {
        if (numero <= 1) {
            return "O número" + numero + "nao é primo";
        }
        for (int contadora = 2; contadora <= Math.sqrt(numero); contadora++) {
            if (numero % contadora == 0) {
                return "O número " + numero + " nao é primo";
            }

        }
        return "O numero " + numero + " e primo";
    }
}