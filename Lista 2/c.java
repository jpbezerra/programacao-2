import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        double number = scanner.nextDouble();

        if (number % 2 == 0) {
            System.out.println(number + " é par.");
        }

        else {
            System.out.println(number + " é ímpar.");
        }

        scanner.close();
    }
}