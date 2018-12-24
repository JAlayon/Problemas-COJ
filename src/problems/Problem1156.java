/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.ArrayList;
import java.util.Scanner;

/**
1156 - Life, the Universe, and Everything
 */
public class Problem1156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n;
        ArrayList<Byte> vi = new ArrayList();
        while((n=sc.nextByte())!=42){
            vi.add(n);
        }
        for (Byte b : vi) {
            System.out.println(b);
        }
        
        
    }
}
