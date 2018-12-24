/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Scanner;

/**
1483 - Geometrical Task I
 */
public class Problem1483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        if(s.equals("square")){
            int a = sc.nextInt();
            System.out.println(a*a);
        }else if(s.equals("rectangle")){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b);
        }
    }
}
