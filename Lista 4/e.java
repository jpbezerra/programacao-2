import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ":");
            arr[i] = scanner.nextDouble();
        }

        System.out.println("Insira a chave de busca:");
        double key = scanner.nextDouble();
        int result = search(arr, key);

        if (result == -1) {
            System.out.println("Chave não encontrada!");
        }

        else {
            System.out.println("Chave encontrada na posição: " + result);
        }

        scanner.close();
    }

    private static int search(double[] arr, double key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return (i + 1);
            }
        }

        return -1;
    }
}