package obi;

import java.util.Arrays;
import java.util.Scanner;

public class planodeestacionamento {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] vagas = new int[m];
        for(int i = 0; i < m; i++){
            vagas[i] = in.nextInt();
        }
        
        Arrays.sort(vagas);
        
        int estacionados = 1;
        for(int i = 1; i < m; i++){
            if(vagas[i] != vagas[i-1]){
                estacionados++;
            }
        }
        
        System.out.printf("%d\n", estacionados);
    }
}
