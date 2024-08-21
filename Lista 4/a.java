import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int num1 = scanner.nextInt();
        
        while (num1 <= 0) {
            System.out.println("Insira um número inteiro positivo:");
            num1 = scanner.nextInt();
        }

        System.out.println("Insira o segundo número:");
        int num2 = scanner.nextInt();
        
        while (num2 <= 0) {
            System.out.println("Insira um número inteiro positivo:");
            num2 = scanner.nextInt();
        }

        int result = maior(num1, num2);

        if (result == -1) {
            System.out.println("Os números são iguais");
        }

        else {
            System.out.println("O maior é: " + result);
        }

        scanner.close();
    }

    private static int maior(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }

        else if (num2 > num1) {
            return num2;
        }

        return -1;
    }
}