
package listadeexercicios1;

import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double n;
        System.out.print("Digite um número: ");
        n = leitor.nextDouble();
        if (n < 0) {
            System.out.println("Número negativo!");
        }
        
        System.out.println("Fim!");
    }
 
}
