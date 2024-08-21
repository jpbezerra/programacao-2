import java.util.Scanner;
import java.lang.Math;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double first = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double second = scanner.nextDouble();

        double result = Math.pow(first, second);
        System.out.println("Resultado: " + result);

        scanner.close();
    }
}