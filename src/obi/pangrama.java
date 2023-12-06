package obi;

import java.util.Scanner;

public class pangrama {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String c = in.nextLine();
        
        String alfabeto = "abcdefghijlmnopqrstuvxz";
        for(int i = 0; i < alfabeto.length(); i++){
            if(!c.contains(Character.toString(alfabeto.charAt(i)))){
                System.out.printf("N");
                return;
            } 
        }
        
        System.out.printf("S");
        
    }
}
