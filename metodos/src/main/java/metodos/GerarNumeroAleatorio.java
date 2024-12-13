package metodos;

import java.util.Random;

public class GerarNumeroAleatorio {
    float Aleatorio(){
        Random random = new Random();
        return random.nextFloat(100)+1;
    }

}
