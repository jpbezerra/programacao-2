import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para somar;\nDigite 2 para subtrair\nDigite 3 para multiplicar\nDigite 4 para dividir;");
        int oper = scanner.nextInt();

        System.out.println("Insira o primeiro valor:");
        double first = scanner.nextDouble();

        System.out.println("Insira o segundo valor:");
        double second = scanner.nextDouble();

        if (oper == 1) {
            System.out.println("Soma: " + (first + second));
        }

        else if (oper == 2) {
            System.out.println("Subtração: " + (first - second));
        }

        else if (oper == 3) {
            System.out.println("Multiplicação: " + (first * second));
        }

        else if (oper == 4) {
            if (second == 0) {
                System.out.println("Divisão por zero.");
            }

            else {
                System.out.println("Divisão: " + (first / second));
            }
        }

        else {
            System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}