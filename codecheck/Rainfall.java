/********************************************************
 *                                                      *
 * PROBLEM:                                             *
 *                                                      *
 * Complete the design of the function called           *
 * averagerainfall that consumes an array of double     *
 * and produces the average, but ignore negative values *
 * (which must have been measurement errors), and stop  *
 * when you reach the sentinel 9999.                    *
 *                                                      *
 * see examples wrapped in check-expect.                *
 *  -with the form: @check_expect (({in}) -> (out))     *
 *  Examples:                                           *
 *  @check_expect (({new double[] {1, 2, 3, 4, 5, 9999}})       -> (3.0)) *
 *  @check_expect (({new double[] {1, 2, -3, 4, 5, 9999}})      -> (3.0)) *
 *  @check_expect (({new double[] {1, 2, 3, 4, 5, 9999, 6, 7}}) -> (3.0)) *
 *  @check_expect (({new double[] {1, 2, 3, -4, 9999, 5}})      -> (2.0)) *
 *  @check_expect (({new double[] {10, 9999}})                  -> (10.0)) *
 *  @check_expect (({new double[] {10, 0, 9999}})               -> (5.0)) *
 *  @check_expect (({new double[] {-1, -2, -3, 9999}})          -> (0.0)) *
 *  @check_expect (({new double[] {9999}})                      -> (0.0)) *
 *                                                      *
 * @author Henrique Rebelo                              *
 ********************************************************/

import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(", ");
        double[] rainfall = new double[temp.length];

        for (int i = 0; i < temp.length; i++) {
            rainfall[i] = Double.parseDouble(temp[i]);
        }

        System.out.println(averageRainfall(rainfall));

        scanner.close();
    }

    public static double averageRainfall(double[] rainfall) {
        double sum = 0;
        int i = 0;
        int count = 0;

        while (rainfall[i] != 9999) {
            if (rainfall[i] > -1) {
                sum += rainfall[i];
                count++;
            }

            i++;
        }

        if (count == 0) {
            return 0.0;
        }

        return sum / count;
    }
}