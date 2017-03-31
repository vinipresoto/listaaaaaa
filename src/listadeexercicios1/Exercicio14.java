
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double n1, n2, d;
        System.out.print("Digite um número: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite um número: ");
        n2 = leitor.nextDouble();
        if (n1 > n2) {
            d = n1 / n2;
            System.out.println("A divisão do número maior pelo menor é: " + d);
        } else {
            d = n2 / n1;
            System.out.println("A divisão do número maior pelo menor é: " + d);
        }
        System.out.println("Fim!");        
    }
}

