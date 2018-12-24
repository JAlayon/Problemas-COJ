
package problems;

import java.math.BigInteger;
import java.util.Scanner;

/**
1306 - Div 4
 */
public class Problem1306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte T;
        BigInteger b;
        T = sc.nextByte();
        while (T-- > 0) {
            b=sc.nextBigInteger();
            if (b.mod(new BigInteger("4")).intValue() == 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
