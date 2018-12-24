/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Scanner;

/**
1188 - Cow Multiplication
 */
public class Problem1188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum =0, auxB;
        a=sc.nextInt();
        b=sc.nextInt();
        auxB = b;
        int c;
        while (a > 0) {
            c = a%10;
            while(auxB > 0){
                sum+=c*(auxB%10);
                auxB/=10;
            }
            auxB=b;
            a/=10;
        }
        System.out.print(sum);
    }
}
