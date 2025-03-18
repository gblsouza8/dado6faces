package dados6faces;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        
        SecureRandom numeroAleatorio = new SecureRandom();


        int i;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;


        for (i = 0; i <= 100; i++){

            int face = 1 + numeroAleatorio.nextInt(6);
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

    System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", contador1, contador2, contador3, contador4, contador5, contador6);

    }



}