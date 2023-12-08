package obi;

import java.util.Scanner;

public class potencia {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       
       int n = Integer.parseInt(in.nextLine());
       
       String[] termos = new String[n];
       for(int i = 0; i < n; i++){
           termos[i] = in.nextLine();
       }
       
       int soma = 0;
       for(int i = 0; i < n; i++){
           int base = Integer.parseInt(termos[i].substring(0, termos[i].length()-1));
           int expoente = Integer.parseInt(termos[i].substring(termos[i].length()-1));
           soma += Math.pow(base, expoente);
       }
       
       System.out.printf("%d\n", soma);
   } 
}

