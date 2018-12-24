
package problems;

import java.math.BigInteger;
import java.util.Scanner;

/**
1102 - You Can Say 11
 */
public class Problem1102 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n;
        while ((n=sc.nextBigInteger()).intValue() != 0) {
            if (n.mod(new BigInteger("11")).intValue() == 0  ) {
                System.out.println(n.toString() + " is a multiple of 11.");
            }else{
                System.out.println(n.toString() + " is not a multiple of 11.");
            }
        }
        
    }
}
