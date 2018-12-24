
import java.util.Arrays;
import java.util.Scanner;


public class DemocracyInDanger {
    public static void main(String[] args) {
        int K,T=0;
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        int x[] = new int[K];
        for (int i = 0; i < K; i++) {
            x[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        for (int i = 0; i < Math.ceil(x.length/2f); i++) {
            T+=x[i]/2+1;
        }
        System.out.println(T);
    }
}
