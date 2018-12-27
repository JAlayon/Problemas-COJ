
package problems;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * 1293 - Powers of Two
 */
public class Problem1293 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BigInteger i = new BigInteger("2");
        i = i.pow(255);
        System.out.println(i);
    }
}
