/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Scanner;

/**
1805 - Harder A+B
 */
public class Problem1805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a,b;
        a=sc.nextLong();
        b=sc.nextLong();
        System.out.println(2*(a+b)+(a-b)+(b-a));
    }
}
