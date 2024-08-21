import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        double first = scanner.nextDouble();

        System.out.println("Insira o primeiro valor:");
        double second = scanner.nextDouble();

        if (first > second) {
            System.out.println("Subtração: " + (first - second));
        }

        else if (second > first) {
            System.out.println("Soma: " + (first + second));
        }

        else {
            System.out.println("Multiplicação: " + (first * second));
        }

        scanner.close();
    }
}