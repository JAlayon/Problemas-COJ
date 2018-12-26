
package problems;

import java.math.BigInteger;
import java.util.Scanner;

/**
1102 - You Can Say 11
 */
public class Problem1102 {
    
    public static void main(String[] args) {
      
        /*Scanner sc = new Scanner(System.in);
        BigInteger n;
        while ((n=sc.nextBigInteger()).intValue() != 0) {
            if (n.mod(new BigInteger("11")).intValue() == 0  ) {
                System.out.println(n.toString() + " is a multiple of 11.");
            }else{
                System.out.println(n.toString() + " is not a multiple of 11.");
            }
        } */
        
        Scanner sc = new Scanner(System.in);
        String number;
        while(!(number = sc.next()).equals("0")){
            if (multipleEleven(number)) {
                System.out.println(number + " is a multiple of 11.");
            }else{
                System.out.println(number + " is not a multiple of 11.");
            } 
        }
 
    }
    
    /**
     * 112233: (1 - 1 + 2 -2 + 3 - 3) = 0 => is multiple of 11 
    */
    public static boolean multipleEleven(String number){
        char[] digits = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = (i % 2 == 0) ? sum + Integer.parseInt(digits[i]+""):  sum - Integer.parseInt(digits[i]+"");
        }
        if(sum%11==0) return true;
        else return false;
    }
}
