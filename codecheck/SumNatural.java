/*******************************************************
 *                                                     *
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called sum      *
 * that consumes a natural number and produces the     *
 * sum of [all] natural numbers starting from 1 to     *
 * the consumed x.                                     *
 * That is:  1 + 2 + 3 + ... + x                       *
 *                                                     *
 * @required the Java "while" loop                     *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *  Examples:                                          *
 *  @check_expect (( { 0 })   -> (0))                  *
 *  @check_expect (( { 1 })   -> (1))                  *
 *  @check_expect (( { 10 })  -> (55))                 *
 *  @check_expect (( { - 10 }) -> (0))                 *
 *  @check_expect (( { 100 })  -> (5050))              *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(sum(number));

        scanner.close();
    }

    public static int sum(int x) {
        int sum = 0;
        int count = 1;

        while(count <= x) {
            sum += count;
            count++;
        }

        return sum;
    }
}