
package problems;
import java.util.Scanner;
/**
1166 - Speed
 */
public class Problem1166 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,N,even,odd;
        T = sc.nextInt();
        while (T-->0) {
            even=0;
            odd=0;
            N=sc.nextInt();
            while (N-->0) {
               if(sc.nextInt()%2==0) even++;
               else odd++;
            }
            System.out.println(even+" even and " + odd + " odd.");
        }
    }
}
