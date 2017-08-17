import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
//Luis Fernando Martínez Bueno  
    

    public static void main(String[] args) {
       try (Scanner read = new Scanner(System.in)) {
            PrintWriter out = new PrintWriter(System.out);
            //kakarotoi
            ArrayList<String> list = new ArrayList<> ();
            String word = read.next();
            int n = read.nextInt();
            int old = 0;
            for (int i = 0; i <= word.length(); i++) {
                if (i + n <= word.length()) {
                    list.add(word.substring(i, i + n));
                }
            }
            list.sort((p1, p2) -> p1.compareTo(p2));
            //list.forEach((x) -> out.println(x));
            out.println(list.get(0));
            out.println(list.get(list.size()-1));
            out.flush();
        }
    }
}



