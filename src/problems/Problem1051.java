
package problems;

import java.util.Scanner;

/**
1051 - Div 3
 */
public class Problem1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n-n/3;
        if(n%3!=0) r--;
        System.out.println(r);
    }
}
