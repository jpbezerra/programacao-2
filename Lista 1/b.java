import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 3 notas, em sequência:");

        float mean = 0;

        for (int i = 0; i < 3; i++) {
            mean += scanner.nextFloat();
        }

        mean /= 3;

        System.out.println("Média aritmética: " + mean);

        scanner.close();
    }
}