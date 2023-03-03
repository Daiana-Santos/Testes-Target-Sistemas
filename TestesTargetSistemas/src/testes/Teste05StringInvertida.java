
package testes;

import java.util.Arrays;

public class Teste05StringInvertida {
    
    public static String reverse (String frase) {
    
        String temporaria = "";
        
        for (int i = frase.length() - 1; i >= 0; i--)
          temporaria += frase.charAt(i);
        return temporaria;
  }


public static void main(String[] args) {
    
    String linguagem = "Target Sistemas";
    
    System.out.println(Teste05StringInvertida.reverse(linguagem)); //Saída avaJ
  }
}