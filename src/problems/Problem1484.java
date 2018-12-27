
package problems;

import java.util.Scanner;

/**
 *
 *  1484 - Hotest Mountain
 */
public class Problem1484 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_position, n;
        double current_temp, current_max_temp;
        n = sc.nextInt();
        current_max_temp = sc.nextDouble();
        max_position = 1;
        for (int i = 2; i <= n; i++) {
            current_temp = sc.nextDouble();
            if(current_temp >= current_max_temp){
                current_max_temp = current_temp;
                max_position = i;
            }
        }
        System.out.print(max_position);
    }
}
