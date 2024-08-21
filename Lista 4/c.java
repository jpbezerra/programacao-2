import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numb = scanner.nextInt();

        System.out.println(numb + " é " + parImpar(numb) + ".");

        scanner.close();
    }

    private static String parImpar(int numb) {
        if (numb % 2 == 0) {
            return "par";
        }

        return "ímpar";
    }
}