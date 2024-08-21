import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int temp = 1;

        while (temp != 0) {
            System.out.println("Insira um número:");
            temp = scanner.nextInt();

            if (temp > 0) {
                positive++;
            }
        }

        System.out.println("Quantidade de positivos: " + positive);

        scanner.close();
    }
}