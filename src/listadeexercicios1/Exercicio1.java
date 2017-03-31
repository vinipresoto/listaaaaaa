
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        float n1, n2, mult;
        System.out.println("Multiplicação de 2 números");
        System.out.println("");
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextFloat();
        mult = n1*n2;
        System.out.printf("O resultado da multiplicação é: %.2f", mult);
        System.out.println("");
        System.out.println("Fim;");
        
    }
    
}
