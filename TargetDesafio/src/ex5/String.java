package ex5;

import java.util.Scanner;

/**
 *
 * @author Giovanna de Oliveira Justino
 */

public class String {
    
    public static void main(String[] args) {
        
        String frase;
        String invertida;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        frase = teclado.nextLine();
               
        for (int i = frase.length(); i < 0; i++) { 
            invertida += frase.charAt(i); 
        }
        System.out.println(frase);
        System.out.println(invertida);
    }
}
