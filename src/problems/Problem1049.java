
package problems;

import java.util.Scanner;

/**
 * 1049 - Sum
Your task is to find the sum of all integer numbers 
lying between 1 and N inclusive.
 */
public class Problem1049 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            n=Math.abs(n);
            n= (n*(n+1)/2 -1)*-1;
        }else{
            n=n*(n+1)/2;
        }
        System.out.println(n);
    }
    
}
