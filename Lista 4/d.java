import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ":");
            arr[i] = scanner.nextDouble();
        }

        outputs(arr);

        scanner.close();
    }

    private static void dividir100(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= 100;
        }
    }

    private static void outputs(double[] arr) {
        dividir100(arr);

        System.out.println("Conteúdo dividido por 100:");
        for (double i : arr) {
            System.out.println(i);
        }
    }
}