package obi;

import java.util.Arrays;
import java.util.Scanner;

public class idadedecamila {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int[] n = new int[3];
        
        for(int i = 0; i < 3; i++){
            n[i] = in.nextInt();
        }
        
        Arrays.sort(n);
        
        System.out.printf("%d\n", n[1]);
    }
}
