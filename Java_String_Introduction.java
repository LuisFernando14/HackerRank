import java.io.*;
import java.util.*;
/*Luis Fernando Martínez Bueno*/
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length();
        System.out.println(sum);
        System.out.println(A.compareTo(B) > 1 ? "Yes" : "No");
        System.out.println(capitalize(A)+" "+capitalize(B));        
    }
    
    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
}

