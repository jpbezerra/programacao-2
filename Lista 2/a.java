import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double first = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double second = scanner.nextDouble();

        if (first > second) {
            System.out.println("O maior é: " + first);
        }

        else if (second > first) {
            System.out.println("O maior é: " + second);
        }

        else {
            System.out.println("Os números são iguais");
        }
        
        scanner.close();
    }
}