/*******************************************************
 *                                                     *
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called product  *
 * that consumes n double numbers and produces the     *
 * product of those numbers.                           *
 *                                                     *
 * @required the Java "while" loop                     *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *  Examples:                                          *
 *  @check_expect (({new double[] {5}})       -> (5.0)) *
 *  @check_expect (({new double[] {5, 5}})    -> (25.0)) *
 *  @check_expect (({new double[] {-5, 5}})   -> (-25.0)) *
 *  @check_expect (({new double[] {-5, -5}})  -> (25.0)) *
 *  @check_expect (({new double[] {3, 3, 0}}) -> (0.0)) *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/

import java.util.Scanner;

public class ProductNNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(", ");
        double[] numbers = new double[temp.length];

        for (int i = 0; i < temp.length; i++) {
            numbers[i] = Double.parseDouble(temp[i]);
        }

        System.out.println(product(numbers));

        scanner.close();
    }

    public static double product(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int idx = 0;
        double total = 1;

        while (idx < numbers.length) {
            total *= numbers[idx];
            idx++;
        }

        return total;
    }
}