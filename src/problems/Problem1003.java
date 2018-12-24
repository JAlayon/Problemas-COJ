
package problems;

import java.util.Scanner;

/**
 1003 - General Election
 */
public class Problem1003 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,M,N;
        int vi[];
        T = sc.nextInt();
        while (T-- > 0) {
            N = sc.nextInt();
            M = sc.nextInt();
            vi = new int[N];
            for (int i = 0; i < M*N; i++) {
                vi[i%N]+=sc.nextInt();
            }
            System.out.println(indexMax(vi));
        }
    }
    
    public static int indexMax(int[]vi){
        int index = 0;
        for (int i = 1; i < vi.length; i++) {
            if (vi[i] > vi[index]) {
                index = i;
            }
        }
        return index+1;
    }
    
}
