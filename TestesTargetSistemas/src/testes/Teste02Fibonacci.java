
package testes;

import java.util.Scanner;

public class Teste02Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Sequência de Fibonacci");
        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();
        
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        int cont = 0;
        
        System.out.print( t1 + "->" + t2 ); 
        
        while (t3 < numero){
            t3 = t1 + t2;
            System.out.print( "->" + t3);
            t1 = t2;
            t2 = t3;
            cont+=1;
            if (t3 == numero){
                System.out.println();
                System.out.println("Seu número está na sequência.");
                break;
            }else if (t3 > numero){
                System.out.println("Seu número não está na sequência.");
            }
        }
              
    }
    
}





     
    
    