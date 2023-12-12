package obi;

import java.util.Scanner;

public class recorde {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int r = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        
        if(r < m){
            System.out.printf("RM");
        } else {
            System.out.printf("*");
        }
        
        if(r < l){
            System.out.printf("RO");
        } else {
            System.out.printf("*");
        }
    }
}
