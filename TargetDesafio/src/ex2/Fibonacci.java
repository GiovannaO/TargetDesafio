package ex2;

import java.util.Scanner;

/**
 *
 * @author Giovanna de Oliveira Justino
 */

public class Fibonacci{
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.print("Digite um número: ");
        n = teclado.nextInt();
        
        if(verificarFibonacci(n)){
            System.out.println(n + " pertence à sequência de Fibonacci.");
        }else{
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }
        
        teclado.close();
    }
    
    public static boolean verificarFibonacci(int n){
        int a = 0;
        int b = 1;
        
        while (b < n){
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return b == n;
    }
}
