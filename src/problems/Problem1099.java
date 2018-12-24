package problems;

import java.util.Scanner;

/**
 * 1099 - Pythagorean Numbers
 */
public class Problem1099 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        while ((a = sc.nextInt()) != 0) {
            b = sc.nextInt();
            c = sc.nextInt();
            if ((a * a == b * b + c * c)
                    || (b * b == a * a + c * c)
                    || (c * c == a * a + b * b)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}
