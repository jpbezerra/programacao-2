import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            arr[i] = scanner.nextInt();
        }

        if (isFirstGreater(arr)) {
            System.out.println("Condição Satisfeita");
        }

        else {
            System.out.println("Erro");
        }

        scanner.close();
    }

    private static boolean isFirstGreater(int[] arr) {
        if (arr[0] > arr[1] && arr[0] > arr[2]) {
            return true;
        }

        return false;
    }
}