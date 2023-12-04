package obi;

import java.util.Scanner;

public class duplasdetenis {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        
        int dif1 = Math.abs((a+b)-(c+d));
        int dif2 = Math.abs((a+c)-(b+d));
        int dif3 = Math.abs((a+d)-(b+c));
        
        if(dif1 <= dif2 && dif1 <= dif3){
            System.out.printf("%d\n", dif1);
        } else {
            if(dif2 <= dif1 && dif2 <= dif3){
                System.out.printf("%d\n", dif2);
            } else {
                if(dif3 <= dif1 && dif3 <= dif2){
                    System.out.printf("%d\n", dif3);
                }
            }
        }
        
    }
}
