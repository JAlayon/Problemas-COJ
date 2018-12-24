
package problems;

import java.util.Scanner;

/**
1028 - All in All
 */
public class Problem1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, t;
        while (sc.hasNextLine()) {
            s=sc.next();
            t=sc.next();
            if (t.contains(s)) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
