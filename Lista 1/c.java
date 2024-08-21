import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salário:");

        double salary = scanner.nextDouble();

        System.out.println("Novo salário: " + (salary * 1.25));

        scanner.close();
    }
}