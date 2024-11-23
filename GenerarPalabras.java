import java.util.Random;

public class GenerarPalabras {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder palabra;

        for (int i = 0; i < 30; i++) {
            int longitud = random.nextInt(6) + 3;
            palabra = new StringBuilder();

            for (int j = 0; j < longitud; j++) {
                char letra = (char) (random.nextInt(26) + 'a');
                palabra.append(letra);
            }
            System.out.println(palabra.toString());
        }
    }

}
