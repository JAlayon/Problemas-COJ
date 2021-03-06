package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * 1306 - Div 4
 */
public class Problem1306 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int T = (int)st.nval;
        String number;
        while (T-- > 0) {
            number = br.readLine();
            pw.println(multipleFour(number));
        }
    }

    public static String multipleFour(String number) {
        if (number.length() > 2) {
            number = number.substring(number.length() - 2);
        }
        int num = Integer.parseInt(number);
        return (num % 4 == 0)?"YES":"NO";
    }
}
