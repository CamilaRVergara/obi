package obi;

import java.util.Scanner;

public class casamentodeinteiros {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String a = in.nextLine();
        String b = in.nextLine();
        
        int zeros = a.length() - b.length();
        if(zeros < 0){
            for(int i = zeros; i < 0; i++){
                a = "0" + a;
            }  
        }
        if(zeros > 0){
            for(int i = 0; i < zeros; i++){
                b = "0" + b;
            }
        }
        
        String na = "";
        String nb = "";
        for(int i = 0; i < a.length(); i++){    
            if(a.charAt(i) == b.charAt(i)){
                na += a.charAt(i);
                nb += b.charAt(i);
            } else {
                if(a.charAt(i) > b.charAt(i)){
                    na += a.charAt(i);
                } else {
                    nb += b.charAt(i);
                }
            }
        }
        
        int n1 = -1;
        int n2 = -1;
        if(!"".equals(na)){
            n1 = Integer.parseInt(na);
        }
        if(!"".equals(nb)){
            n2 = Integer.parseInt(nb);
        }
        
        if(n1 < n2){
            System.out.printf("%d\n", n1);
            System.out.printf("%d\n", n2);
        } else {
            System.out.printf("%d\n", n2);
            System.out.printf("%d\n", n1);
        }  
    }
}

