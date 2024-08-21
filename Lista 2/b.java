import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double first = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double second = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double third = scanner.nextDouble();

        if (first > second && first > third) {
            System.out.println("Condição Satisfeita");
        }

        else {
            System.out.println("Erro");
        }

        scanner.close();
    }
}