package problems;

import java.util.Scanner;


/*
1000 - A+B Problem
For this problem you must calculate A + B, numbers given in the input.
*/
public class Problem1000 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        
        System.out.println(a+b);
    }
}
