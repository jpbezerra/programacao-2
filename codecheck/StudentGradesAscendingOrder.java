/*******************************************************
 *                                                     *
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called          *
 * getGradesInAscendingOrder that consumes an array of *
 * grades and produces the grades in ascending order.  *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *  Examples:                                          *
 *  @check_expect (({new double[] {10}})                 -> (double[]{10})) *
 *  @check_expect (({new double[] {10, 0}})              -> (double[]{0, 10})) *
 *  @check_expect (({new double[] {10, 9, 8, 2}})        -> (double[]{2, 8, 9, 10})) *
 *  @check_expect (({new double[] {5, 9, 1, 2, 3}})      -> (double[]{1, 2, 3, 5, 9})) *
 *  @check_expect (({new double[] {10, 9, 10, 1, 2, 1}}) -> (double[]{1, 1, 2, 9, 10, 10})) *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/

import java.util.Scanner;

public class StudentGradesAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(", ");
        double[] grades = new double[temp.length];

        for (int i = 0; i < temp.length; i++) {
            grades[i] = Double.parseDouble(temp[i]);
        }

        grades = getGradesInAscendingOrder(grades);

        for (int i = 0; i < grades.length; i++) {
            if (i == grades.length - 1) {
                System.out.printf("%f", grades[i]);
            }

            else {
                System.out.printf("%f, ", grades[i]);
            }
        }

        scanner.close();
    }

    public static double[] getGradesInAscendingOrder(double[] grades) {
        quickSort(grades, 0, grades.length - 1);

        return grades;
    }

    public static void quickSort(double[] grades, int left, int right) {
        if (left < right) {
            int middle = partition(grades, left, right);
            quickSort(grades, left, middle - 1);
            quickSort(grades, middle + 1, right);
        }
    }

    public static int partition(double[] grades, int left, int right) {
        double p = grades[left];
        int i = left;
        int j = right + 1;

        do {
            do {
                i++;
            } while (grades[i] < p && i < right);

            do {
                j--;
            } while(grades[j] > p);

            swap(grades, i, j);
        } while (i < j);
        swap(grades, i, j);
        swap(grades, left, j);
        return j;
    }

    public static void swap(double[] grades, int i, int j) {
        double temp = grades[i];
        grades[i] = grades[j];
        grades[j] = temp;
    }
}