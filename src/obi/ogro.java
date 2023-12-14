package obi;

import java.util.Scanner;

public class ogro {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        String esquerda = "";
        String direita = "";
        
        if(n <= 5){
            if(n == 0){
                esquerda = "*";
            } else {
                for(int i = 0; i < n; i++){
                    esquerda += "I";
                }
            }
            direita = "*";
        } else {
            esquerda = "IIIII";
            for(int i = 0; i < (n-5); i++){
                direita += "I";
            }
        }
        
        System.out.println(esquerda);
        System.out.printf(direita);
    }
}
