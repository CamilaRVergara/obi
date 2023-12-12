package obi;

import java.util.Scanner;

public class robo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
     
        int[] dados = new int[3];
        String d = in.nextLine();
        for (int i = 0; i < dados.length; i++) {
            dados[i] = Integer.parseInt(d.split(" ")[i]);
        }
        
        int[] comandos = new int[dados[1]];
        String c = in.nextLine();
        for (int i = 0; i < comandos.length; i++) {
            comandos[i] = Integer.parseInt(c.split(" ")[i]);
        }
        
        int contador = 0;
        if(dados[2] == 1){
            contador = 1;
        } 
        
        int localizacao = 1;
        for(int i = 0; i < dados[1]; i++){
            if(localizacao == 1 && comandos[i] == -1){
                localizacao = dados[0];
            } else {
                if(localizacao == dados[0] && comandos[i] == 1){
                    localizacao = 1;
                } else {
                    localizacao += comandos[i];
                }
            }
            
            if(localizacao == dados[2]){
                contador++;
            }
        }
        
        System.out.printf("%d\n", contador);
    }
}
