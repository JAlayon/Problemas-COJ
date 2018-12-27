/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 *
 * 1064 - Alarm Clock
 */
public class Problem1064 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(bf);

        int h1, m1, h2, m2;
        while (true) {
            st.nextToken();
            h1 = (int) st.nval;
            st.nextToken();
            m1 = (int) st.nval;
            st.nextToken();
            h2 = (int) st.nval;
            st.nextToken();
            m2 = (int) st.nval;
            if (h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0) 
                break;
            pw.println(calculateMins(h1, m1, h2, m2));
        }
    }

    public static int calculateMins(int h1, int m1, int h2, int m2) {
        int total_mins = 0;
        while (h1 != h2 || m1 != m2) {
            total_mins++;
            m1++;
            if (m1 > 59) {
                m1 = 0;
                h1++;
                if (h1 > 23) {
                    h1 = 0;
                }
            }
        }
        return total_mins;
    }
}
