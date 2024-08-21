import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 1) {
            isPrime = false;
        }

        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " é primo.");
        }

        else {
            System.out.println(number + " não é primo.");
        }

        scanner.close();
    }
}