package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 1485 - Increasing Order Word
 */
public class Problem1485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
       // char c[] = st.sval.toCharArray();
        /*int j;
        char aux;
        for (int i = 1; i < c.length; i++) {
            aux = c[i];
            j = i - 1;
            while ((j >= 0) && (c[j] > aux)) {
                c[j + 1] = c[j];
                j--;
            }
            c[j + 1] = aux;
        }
         */

        /*IMPLEMENTACION COMO ESTRUCTURA DE ARBOL
        Tree tree = new Tree();
        tree.root.c = c[0];
        for (int i = 1; i < c.length; i++) {
            tree.insert(c[i]);
        }
        tree.print(tree.root);
        */
        
        ArrayList<Character> vi = new ArrayList<>();
        for (int i = 0; i < st.sval.length(); i++) {
            vi.add(st.sval.charAt(i));
        }
        
        Collections.sort(vi);
        String s="";
        for (Character character : vi) {
            s+=character;
        }
        System.out.print(s);

    }

    static class Tree {

        class Node {

            char c;
            Node izq, der;
        }
        Node root = new Node();

        void insert(char c) {
            Node nuevo = new Node();
            nuevo.c = c;
            nuevo.izq = null;
            nuevo.der = null;

            Node anterior = null, reco;
            reco = root;
            while (reco != null) {
                anterior = reco;
                if (c < reco.c) {
                    reco = reco.izq;
                } else {
                    reco = reco.der;
                }
            }
            if (c < anterior.c) {
                anterior.izq = nuevo;
            } else {
                anterior.der = nuevo;
            }
        }
        
        void print(Node n){
            if (n!=null) {
                print(n.izq);
                System.out.print(n.c);
                print(n.der);
            }
        }
    }
}
