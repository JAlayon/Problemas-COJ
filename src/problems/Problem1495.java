
package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
1495 - Increasing Order List
 */
public class Problem1495 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vi[] = new int[n];
        for (int i = 0; i < n; i++) {
            vi[i] = sc.nextInt();
        }
        Arrays.sort(vi);
        for (int i : vi) {
            System.out.println(i);
        }
    }
}
