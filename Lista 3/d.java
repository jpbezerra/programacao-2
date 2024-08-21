import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int smaller = scanner.nextInt();

        System.out.println("Insira o valor de B:");
        int bigger = scanner.nextInt();

        for (int i = smaller; i <= bigger; i++) {
            if (i % 2 != 0) {
                System.out.println("É ímpar: " + i);
            }
        }

        scanner.close();
    }
}