
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
    1288 - Div 6
 */
public class Problem1933 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int l = (int)st.nval;
        st.nextToken();
        int r = (int)st.nval;
        while(l != 0 && r != 0){
            System.out.println(l+r);
            st.nextToken();
            l = (int)st.nval;
            st.nextToken();
            r = (int)st.nval;
        }
    }
}
