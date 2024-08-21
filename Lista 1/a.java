import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 4 notas, em sequência:");

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += scanner.nextInt();
        }

        System.out.println("Resultado da soma: " + sum);

        scanner.close();
    }
}