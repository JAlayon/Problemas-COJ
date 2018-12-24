
import java.util.Scanner;


public class TrainSwapping {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int L;
        int x[];
        int count;
        int t;
        N = sc.nextInt();
        while(N-->0){
            count=0;
            L = sc.nextInt();
            x = new int[L];
            for (int i = 0; i < L; i++) {
                x[i] = sc.nextInt();
            }
            for (int i = 0; i < x.length; i++) {
                for (int j = 1; j < x.length; j++) {
                    if (x[j-1] > x[j]) {
                        t = x[j-1];
                        x[j-1] = x[j];
                        x[j] = t;
                        count++;
                    }
                }
            }
            System.out.println("Optimal train swapping takes "+count+" swaps.");
        }
        
        
    }
}
