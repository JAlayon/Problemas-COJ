
package problems;

import java.util.Scanner;

/**
1023 - Financial Management
 */
public class Problem1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        int i=12;
        while (i>0) {
            sum+=sc.nextDouble();
            i--;
        }
        System.out.printf("$%.2f", sum/12);
        
    }
}
