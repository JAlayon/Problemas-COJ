
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
    1078 - Another Candies
 */
public class Problem1078 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(br);
        
        int T, N, sum;
        st.nextToken();
        T = (int) st.nval;
        while (T-- > 0) {
            st.nextToken();
            sum = 0;
            N = (int) st.nval;
            for(int i = 0; i < N; i++){
                st.nextToken();
                sum+=(int)st.nval;
            }
            pw.println((sum%N==0)?"YES":"NO");
        }
    }
}
