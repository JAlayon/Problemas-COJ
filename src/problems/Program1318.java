package problems;

import java.util.Scanner;

/**
 * 1318 - Abc
 */
public class Program1318 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[3];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int j, aux;
        for (int i = 1; i < x.length; i++) {
            aux = x[i];
            j = i - 1;
            while ((j >= 0) && (x[j] > aux)) {
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = aux;
        }
        String s = sc.next();
        switch (s) {
            case "ABC":
                System.out.print(x[0] + " " + x[1] + " " + x[2]);
                break;
            case "BAC":
                System.out.print(x[1] + " " + x[0] + " " + x[2]);
                break;
            case "BCA":
                System.out.print(x[1] + " " + x[2] + " " + x[0]);
                break;
            case "ACB":
                System.out.print(x[0] + " " + x[2] + " " + x[1]);
                break;
            case "CBA":
                System.out.print(x[2] + " " + x[1] + " " + x[0]);
                break;
            case "CAB":
                System.out.print(x[2] + " " + x[0] + " " + x[1]);
                break;
        }

    }
}
