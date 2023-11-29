package obi;

import java.util.Scanner;

public class torneiodetenis {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int v = 0;
        for(int i = 1; i <= 6; i++){
            String l = in.next();
            if(l.equals("V")){
                v++;
            }
        }
        
        if(v < 1){
            System.out.printf("%d\n", -1);
        } else {
            if(v < 3){
                System.out.printf("%d\n", 3);
            } else {
                if(v < 5){
                    System.out.printf("%d\n", 2);
                } else {
                    System.out.printf("%d\n", 1);
                }
            }
        }
        
    }
}
