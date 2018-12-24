package problems;

import java.util.Scanner;

/**
 * 1059 - Numeric Parity
 */
public class Problem1059 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, val, sum;
        String b;
        while ((n = sc.nextInt()) != 0) {
            sum=0;
            b="";
            while (n > 0) {
                val = n % 2;
                if (val == 1)sum++;
                b = val + b;
                n /= 2;
            }
            System.out.println("The parity of "+b+" is "+sum+" (mod 2).");
        }
    }
}
