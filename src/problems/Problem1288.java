package problems;

import java.util.Scanner;

/**
 * 1288 - Div 6
 */
public class Problem1288 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number;
        int T = sc.nextInt();
        while (T-- > 0) {
            number = sc.next();
            System.out.println(multipleSix(number));
        }
    }

    public static String multipleSix(String number) {
        char lastDigit = number.charAt(number.length() - 1);
        int v = Integer.parseInt(String.valueOf(lastDigit));
        if (v%2!=0)
            return "NO";

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return (sum % 3 == 0) ? "YES" : "NO";
    }
}