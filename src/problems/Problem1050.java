
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 *
 * @author alayon
 */
public class Problem1050 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int n = (int)st.nval;
        int coprimes = 1;
        for (int i = 2; i < n; i++) {
            if(coprimes(i,n)) coprimes++;
        }
        pw.println(coprimes);
    }
    
    public static boolean coprimes(int a, int b){
        for (int i = 2; i <= a; i++) {
            if(a%i==0 && b%i==0)
                return false;
        }
        return true;
    }
}
