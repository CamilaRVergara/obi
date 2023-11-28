package obi;

import java.util.Scanner;

public class planodeinternet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int n = in.nextInt();
        
        int m_i = 0;
        for(int i = 1; i <= n; i++){
          m_i += in.nextInt();
        }
     
        System.out.printf("%d\n", (x*(n+1))-m_i);
    }
}
