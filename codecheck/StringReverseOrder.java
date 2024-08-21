/*******************************************************
 *                                                     *
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called          *
 * getStringInReverseOrder that consumes a String      *
 * and produces it in a reverse order.                 *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *  Examples:                                          *
 *  @check_expect (({"Java"})        -> ("avaJ"))      *
 *  @check_expect (({"String"})      -> ("gnirtS"))    *
 *  @check_expect (({"12345678910"}) -> ("01987654321")) *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/

import java.util.Scanner;

public class StringReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        word = getStringInReverseOrder(word);

        System.out.println(word);

        scanner.close();
    }

    public static String getStringInReverseOrder(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i > -1; i--) {
            reverse = reverse + word.charAt(i);
        }

        return reverse;
    }
}