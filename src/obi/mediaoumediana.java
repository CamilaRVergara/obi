package obi;

import java.util.Arrays;
import java.util.Scanner;

public class mediaoumediana {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        
        for(int i = -1000000000; i <= 1000000000; i++){
            int[] n = new int[3];
            n[0] = a;
            n[1] = b;
            n[2] = i;
            Arrays.sort(n);
            int media = 0;
            
            for(int j = 0; j <= 2; j++){
                media += n[j];
            }
            
            if((media/3) == n[1]){
                System.out.printf("%d\n", i);
                return;
            }
        }
    }
}
