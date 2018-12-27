
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
1028 - All in All
 */
public class Problem1028 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(br);
        int token;
        char s[], t[];
        while ((token = st.nextToken()) != StreamTokenizer.TT_EOF) {
            s = st.sval.toCharArray();
            st.nextToken();
            t = st.sval.toCharArray();
            if(isSubsequence(s,t))
                pw.println("Yes");
            else
                pw.println("No");
        }
    }
        
    public static boolean isSubsequence(char s[], char t[]){
        int foundLetters = 0;
        int i = 0;
        for (char c : s) {
            while (i< t.length) {
                if(c == t[i++]){
                    foundLetters++;
                    break;
                }
            }
        }
        
        return foundLetters == s.length;
    }
}
