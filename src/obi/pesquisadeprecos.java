package obi;

import java.util.Scanner;

public class pesquisadeprecos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        
        String[][] dados = new String[n][3];
        
        for(int i = 0; i < n; i++){
            System.arraycopy(in.nextLine().split(" "), 0, dados[i], 0, 3);
        }
        
        int vantagem = 0;
        for(int i = 0; i < n; i++){
            if(Double.parseDouble(dados[i][1]) <= (0.7*Double.parseDouble(dados[i][2]))){
                vantagem++;
                System.out.printf(dados[i][0]);
            } 
        }
        
        if(vantagem == 0){
            System.out.printf("*");
        }
    }
}
