
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 *
 * 1004 - Traversing Grid
 */
public class Problem1004 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(br);
        
        int T, N, M;
        st.nextToken();
        T = (int) st.nval;
        while (T-- > 0) {
            st.nextToken();
            N = (int) st.nval;
            st.nextToken();
            M = (int) st.nval;
            pw.println(evaluateCase(N,M));
        }
    }
    
    private static String evaluateCase(int n, int m){
        if(n==1) return "R";
        if(m==1) return "D";
       
        if (n==m) {
            if(n%2==0) return "L";
            else return "R";
        }
        else if(n > m){
            if(m%2==0) return "U";
            else return "D";
        }
        else{
            if(n%2==0) return "L";
            else return "R";
        }
    }
}
