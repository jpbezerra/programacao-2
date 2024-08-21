import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println("Série numérica:");
        for (int i = first + 1; i < second; i++) {
            System.out.printf("%d ", i);
        }

        scanner.close();
    }
}