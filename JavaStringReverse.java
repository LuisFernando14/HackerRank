package problems;

import java.util.*;
import java.io.*;
/**
 *
 * @author lfmartinezb
 */
public class JavaStringReverse {
    public static void main (String [] args) {
        try (Scanner read = new Scanner(System.in)) {
            PrintWriter out = new PrintWriter (System.out);
            String word = read.next();
            String comp = "";
            for(int i = word.length()-1; i>=0; i--) {
                comp += word.charAt(i);
            }
            System.out.println(word.equals(comp) ? "Yes" : "No");
            out.flush();
        }
    }
}


