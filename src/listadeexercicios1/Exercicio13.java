
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double n1, n2, n3;
        System.out.print("Digite um número: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite um número: ");
        n2 = leitor.nextDouble();
        System.out.print("Digite um número: ");
        n3 = leitor.nextDouble();
        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("O maior número digitado foi: " + n1);
        } else if ((n2 > n3) && (n2 > n1)) {
            System.out.println("O maior número digitado foi: " + n2);
        } else {
            System.out.println("O maior número diggitado foi " + n3);
        }
        System.out.println("Fim!");
        
    }
 
}
