package obi;

import java.util.Arrays;
import java.util.Scanner;

public class anagrama {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       
       int n = Integer.parseInt(in.nextLine());
       
       char[] f1 = in.nextLine().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
       char[] f2 = in.nextLine().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
       
       
       Arrays.sort(f1);
       Arrays.sort(f2);
       
       if (Arrays.equals(f1, f2)) {
        System.out.printf("S");
       } else {
        System.out.printf("N");
       }
   } 
}
