/*******************************************************
 *                                                     *
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called product  *
 * that consumes two double numbers and produces the   *
 * product of those numbers.                           *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *  Examples:                                          *
 *  @check_expect (({2.0, 2.0})   -> (4.0))            *
 *  @check_expect (({2.0, 0.0})   -> (0.0))            *
 *  @check_expect (({2.0, 1.0})   -> (2.0))            *
 *  @check_expect (({2.0, -1.0})  -> (-2.0))           *
 *  @check_expect (({-2.0, -1.0}) -> (2.0))            *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/

import java.util.Scanner;

public class ProductTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println(product(first, second));

        scanner.close();
    }

    public static double product(double first, double second) {
        return first * second;
    }
}