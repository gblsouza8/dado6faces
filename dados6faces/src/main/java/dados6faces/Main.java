package dados6faces;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random numeroAleatorio = new Random();


        int i;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;


        for (i = 0; i <= 100; i++){

            int face = numeroAleatorio.nextInt(1,6);
            switch(face)
            {
                case 1: 
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                case 6:
                    contador6++;
                    break;
            }
        }

    }



}